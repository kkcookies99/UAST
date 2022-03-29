 class Solution:
    def XXX(self, n: int) -> List[str]:
        if n == 0:
            return [""]
        if n == 1:
            return ["()"]
        res = []
        for i in range(0,n):
            for tmpa in self.XXX(i):
                for tmpb in self.XXX(n-1-i):
                    res.append(f"({tmpa}){tmpb}")
        return res

