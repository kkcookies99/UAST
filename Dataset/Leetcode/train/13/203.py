class Solution:
    def XXX(self, s: str) -> int:
        dir={'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000} 
        ans=0
        for i in range(len(s)-1):
            if dir[s[i]] >= dir[s[i+1]]:
                ans+=dir[s[i]]
            else :
                ans-=dir[s[i]]
        ans+=dir[s[-1]]
        return ans

