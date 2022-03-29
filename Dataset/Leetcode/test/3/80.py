 class Solution:
    def XXX(self, s: str) -> int:
        l = []
        res = []
        for x in s:
            if x not in l:
                l.append(x)
            else:
                res.append(len(l))
                i = l.index(x)
                l = l[i+1:]
                l.append(x)
        res.append(len(l))
        return max(res) if res else 0
        

