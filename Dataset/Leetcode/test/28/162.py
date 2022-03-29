 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        n = len(haystack)
        k = len(needle)
        
        res = []
        if needle == haystack:
            return 0
        if haystack != '' and needle == '':
            return 0
        start = 0
        for i in range(n):
            res.append([haystack[start:start+k],start])
            start += 1
            if start+k == n+1:
                break
        
        for j in res:
            if j[0] == needle:
                return j[1]
        return -1

