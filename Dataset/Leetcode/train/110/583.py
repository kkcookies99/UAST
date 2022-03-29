class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return True
        def helper(root):
            if root is None:
                return 0
            return max(helper(root.left),helper(root.right))+1
        def dfs(root):
            if root is None:
                return True
            if abs(helper(root.left)-helper(root.right)) > 1:
                return False
            return dfs(root.left) and dfs(root.right)
        return dfs(root)

