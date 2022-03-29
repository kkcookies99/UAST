 class Solution:
    def XXX(self, s: str) -> int:
        hashMap = {}
        i, j = 0, 0 
        res = 0
        while(j<len(s)):
            if s[j] not in hashMap.keys():
                hashMap[s[j]]=1
            else:
                hashMap[s[j]]+=1    
            while(hashMap[s[j]]>1):
                hashMap[s[i]]-=1
                i+=1
            res = max(res, j-i+1)
            j+=1
        return res

