 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def dfs(left, right):
            if left and right:
                if left.val != right.val:
                    return False
            else:
                if left != right:
                    return False
                return True
            return dfs(left.left, right.right) and dfs(left.right, right.left)
        if not root: return True
        return dfs(root.left, root.right)

