class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        res = []
        def dfs(root, depth):
            if root is None:
                return
            if depth == len(res):
                res.append([root.val])
            else:
                res[depth].append(root.val)
            dfs(root.left, depth + 1)
            dfs(root.right, depth + 1)

        dfs(root, 0)
        return res

