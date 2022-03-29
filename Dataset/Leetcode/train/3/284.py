 class Solution:
    def XXX(self, s: str) -> int:
        left = -1
        res = 0
        hashmap = {}
        for index,char in enumerate(s):
            if ((char in hashmap) and (hashmap[char]>left)) :
                left=hashmap[char]
            hashmap[char]=index
            res=max(res,index-left)
        return res

