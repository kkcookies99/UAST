class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        
        def dfs(root: TreeNode, value: int):
            # if not root:
            #     return value
            if (not root.left and not root.right) or not root:
                return value
            if not root.left:
                return dfs(root.right, value + 1)
            if not root.right:
                return dfs(root.left, value + 1)
            left = dfs(root.left, value + 1)
            right = dfs(root.right, value + 1)
            return min(left, right)
        return dfs(root, 1)

