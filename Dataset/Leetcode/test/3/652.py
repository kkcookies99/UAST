 class Solution:
    def XXX(self, s: str) -> int:
        res=0
        hashset=set()
        i,j=0,0
        for j in range(len(s)):
            if s[j] in hashset:
                res=max(res,len(hashset))
                while s[j] in hashset:
                    hashset.remove(s[i])
                    i+=1
            hashset.add(s[j])
        res=max(res,len(hashset))
        return res

