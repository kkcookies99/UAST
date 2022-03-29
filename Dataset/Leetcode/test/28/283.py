 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        n=len(needle)#匹配串的长度
        m=len(haystack)#原串的长度
        if n==0:
            return 0
        next=self.getnext(needle)
        i,j=0,0 #i是原字符串的指针
        while i<m:
            if haystack[i]==needle[j]:
                i+=1
                j+=1
            if j==n:
                return i-j
            if i<m and haystack[i]!=needle[j]:
                if j!=0:
                    j=next[j-1]
                else:#即j=0时
                    i+=1
        return -1

    def getnext(self,needle):
        a=len(needle)
        j=0
        next=[0 for i in range(a)]
        for i in range(1,a):
            while j>0 and needle[i]!=needle[j]:
                j=next[j-1]
            if needle[i]==needle[j]:
                next[i]=j+1
                j+=1
        return next

