 class Solution:
    def XXX(self, n: int) -> List[str]:
        res = []

        def dfs(depth, path, count):
            """深度优化搜索
            depth: 遍历深度
            path: 当前节点
            count: 左括号数量
            """
            # 递归终结条件
            if depth == 2 * n:
                # ⑴ + ⑵ 保证解有效性，此时左右括号数量相等
                res.append("".join(path))
                return
            if count < n:  # 1. 保证左括号数量 count <= n 
                dfs(depth + 1, path + ["("], count + 1)
            # 2. 左括号数量大于有括号数量时才能添加右括号 
            if count > depth - count:
                dfs(depth + 1, path + [")"], count)

        dfs(1, ["("], 1)
        return res

