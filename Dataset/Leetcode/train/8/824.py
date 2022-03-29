 class Solution(object):
    def XXX(self, str):
        """
        :type str: str
        :rtype: int
        """
        res = []
        flag = True                    # 标记，默认字符串第一个非空格字符为有效整数或'-'或‘+’
        
        numslist = ['0','1','2','3','4','5','6','7','8','9'] 
        for i in range(len(str)):
            if str[i] ==' ' and flag:  # 如果均为空格字符，且无非空字符出现继续
                continue
                
            if str[i] == '+' and flag: # 如果“+”字符第一次出现，则添加到列表中，标记修改为False并继续
                res.append(str[i])
                flag = False
                continue
                
            if str[i] == '-' and flag: # 如果“-”字符第一次出现，则添加到列表中，标记修改为False并继续
                res.append(str[i])
                flag = False
                continue
                
            if str[i] not in numslist: # 除过上述情况，如果字符不为数字，则直接退出迭代
                break
            else:
                res.append(str[i])     # 反之有数字出现,添加到列表中，并修改标记为False
                flag = False
                
        res = ''.join(res)             # 拼接字符串 
        if res == '-' or res=='' or res=='+':
            return 0
        else :
            res = int(res)
        
        if res>2**31-1:               # 特殊情况处理
            return 2**31-1
        if res<-2**31:
            return -2**31
        else:
            return res
