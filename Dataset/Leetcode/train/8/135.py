class Solution:
    def XXX(self, str: str) -> int:
        INT_MAX = pow(2,31)-1
        INT_MIN = pow(2,31)
        tag = 1
        #去掉左边的空格
        str = str.lstrip(' ')
        if(len(str)==0):
            return 0
        #如果第一位是负号更改tag值，i后移一位
        if(str[0] == '-' or str[0]=='+'):
            if(str[0]=='-'):
                tag = -1
            str = str[1:]
        #如果处理完的字符串为空，返回0
        if(len(str) == 0):
            return 0
        #如果第一位不是数字，直接返回0
        if(str[0]<'0' or str[0]>'9'):
            return 0
        #现在剩下的字符串是以数字开头了
        else:
            #遍历字符串直到不是数字或者到末尾
            for i in range(len(str)):
                if(str[i]<'0' or str[i]>'9'):
                    break
            #转化为整数形式
            if(i==len(str)-1 and str[i]>='0' and str[i]<='9'):
                ans = int(str[:])
            else:
                ans = int(str[:i])
            #如果溢出返回截断后的值
            if(tag==1 and ans>INT_MAX):
                return tag*INT_MAX
            elif(tag==-1 and ans>INT_MIN):
                return tag*INT_MIN
            else:    
                return tag*ans

