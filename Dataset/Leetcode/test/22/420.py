 class Solution:
    def XXX(self, n: int):
        return sorted(list(self.dfs(n, n)))

    def dfs(self, z_num, f_num):
        res = set()
        if f_num == 1 and z_num == 0:
            return [")"]
        if f_num > z_num:
            for a in self.dfs(z_num, f_num-1):
                res.add(")" + a)
        if z_num != 0:
            for a in self.dfs(z_num-1, f_num):
                res.add("(" + a)
        return res

