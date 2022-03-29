 class Solution:
    def XXX(self, n: int) -> List[str]:
        res = []

        def dfs(idx, left, right, pre_str):
            if idx == 2 * n:
                res.append(pre_str)
                return
            # 左小于n
            if left < n:
                dfs(idx + 1, left + 1, right, pre_str + "(")
            if left > right:
                dfs(idx + 1, left, right + 1, pre_str + ")")

        dfs(0, 0, 0, "")
        return res

