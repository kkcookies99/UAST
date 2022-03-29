 class Solution:
    def XXX(self, str: str) -> int:
        res = 0
        if str=='':
            return res
        for l in range(len(str)):
            if str[l] == ' ':
                continue
            else:
                break
        new_str = ''
        nums = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
        # 如果非空字符为'-'且下一个字符为数字,那么继续执行
        if len(str)==1:
            if str in nums:
                res = int(str)
                return res
            else:
                return res
        elif str[l] == '-' and str[l + 1] in nums:
            pass
        elif str[l] == '+' and str[l + 1] in nums:
            pass
        # 如果非空字符为数字,那么继续执行
        elif str[l] in nums:
            pass
        # 其他情况直接返回0
        else:
            return res
        # 开始取值
        for i in range(l, len(str)):
            if str[l] == '-'and i==l:
                new_str += str[l]
                continue
            if str[l] == '+' and i==l:
                print('起始的字符为正')
                continue
            if str[i] in nums:
                new_str += str[i]
            else:
                break
        res = int(new_str)
        if -2147483648 <= res <= 2147483647:
            return res
        elif res < -2147483648:
            return -2147483648
        else:
            return 2147483647

