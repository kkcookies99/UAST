 class Solution(object):
    def XXX(self, s):
        n=len(s)
        if n<=1:
            return n
        import collections
        dick = collections.Counter([])
        i,j=0,0
        ma=0
        while(j<n):
            if dick[s[j]]==0:                
                dick[s[j]]+=1
                j+=1
            else:                
                dick[s[i]]-=1
                i+=1
            ma=max(ma,j-i)
        return ma

