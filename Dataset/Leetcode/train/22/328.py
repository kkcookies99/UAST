 class Solution:
    def XXX(self, n: int) -> List[str]:
        self.ans = []
        self.dfs("", n, n)
        return self.ans

    def dfs(self, s, l, r):
        if l < 0 or r < 0:
            return
        elif l == 0 and r == 0:
            self.ans.append(s)
        elif l == r:
            self.dfs(s+'(', l-1, r)
        else:
            self.dfs(s+'(', l-1, r)
            self.dfs(s+')', l, r-1)

