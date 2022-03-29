 class Solution:
    def XXX(self, n: int):

        arr = []
        self.dfs(n, n, "", arr)
        return arr

    def dfs(self, m, n, s, arr):
        if m < 0 or n < 0 or m > n:
            return
        if m == 0 and n == 0:
            arr.append(s)
            return

        self.dfs(m - 1, n, s + "(", arr)
        self.dfs(m, n - 1, s + ")", arr)

