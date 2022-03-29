 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def dfs(root, lower=float('-inf'), upper=float('inf')):
            if not root:
                return True
            
            val = root.val
            if val <= lower or val >= upper:
                return False

            if not dfs(root.left, lower, val):
                 return False
            if not dfs(root.right, val, upper):
                return False
            return True
        return dfs(root)

