class Solution(object):
    def XXX(self, str):
        """
        :type str: str
        :rtype: int
        """
        INT_MAX = 2**31-1
        INT_MIN = -2**31        
        sett = ['+','-','0','1','2','3','4','5','6','7','8','9']
        i = 0

        #注意空字符不要写成'',应该是' '
        #先把指针移到第一个非空字符
        while i<len(str) and str[i]==" ":
            i+=1
        if i>=len(str): return 0       
        if str[i] not in sett : return 0
        
        #对第一个非空字符分情况讨论：
        #一类是以+，-开头；
        #一类是以数字开头；
        flag = 1
        if str[i]=='+' or str[i]=='-':                        
            if str[i]=="-": flag=-1
            i+=1 
            if i>=len(str): return 0
            #如果第一个数是+或者-，但是下一个数不是数字，不满足要求，return 0
            if str[i] not in sett[2:]: return 0     
        
        #开始读数
        x = 0        
        while i<len(str) and str[i] in sett[2:] :
            x = x*10 + int(str[i])
            i+=1        
        x *= flag
        
        #判断是否溢出
        if flag>0:
            return x if x <= INT_MAX else INT_MAX
        else:
            return x if x >= INT_MIN else INT_MIN

