 class Solution:
    def XXX(self, n: int) -> List[str]:
        result = []
        def dfs(left=0, right=0, x=''):
            if left == n:
                return result.append(x + ')' * (n - right))
            left > right and dfs(left, right+1, x+')') or dfs(left+1, right, x+'(')
        return dfs() or result

