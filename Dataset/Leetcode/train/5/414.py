 class Solution:
    def XXX(self, s: str) -> str:
        # 1025 third coding two pointers
        n = len(s)
        if n<=1: return s
        def isValid(left,right,maxlen,res):#中心扩展法的复杂度更低，减少一层循环！
            while left>=0 and right<n and s[left]==s[right]:
                #如果把s[left]==s[right]放在下边判断，需要讨论left和right取值！
                if right-left+1>maxlen:
                    maxlen = right-left+1
                    res = s[left:right+1]#提前记录结果，不许再修改left和right取值
                left-=1
                right+=1
            return maxlen, res
        
        maxlen = 0
        res = ''
        for i in range(n-1):#依次访问各个点，指针的起点！
            maxlen,res = isValid(i,i,maxlen,res)
            maxlen,res  = isValid(i,i+1,maxlen,res)
        return res


