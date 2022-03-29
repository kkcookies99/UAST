 class Solution:
    def XXX(self, n: int) -> List[str]:
        if n == 1: return ["()"]
        subres = self.XXX(n-1)
        res = set([])
        for sr in subres:
            for i in range(len(sr)):
                res.add(sr[:i]+"()"+sr[i:])
                res.add(sr+"()")
        return list(res)

