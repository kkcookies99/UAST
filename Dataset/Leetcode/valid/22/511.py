 class Solution:
    def XXX(self, n: int) -> List[str]:
        ans = []
        def dfs(n, path, open, close):
            if len(path) == 2 * n:
                ans.append(path)
                return

            if open < n:
                dfs(n, path + '(', open + 1, close)
            
            if close < open:
                dfs(n, path + ')', open, close + 1)

        dfs(n, '', 0, 0)

        return ans

