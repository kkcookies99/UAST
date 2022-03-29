 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if root is None:
            return True
        def dfs(root, min, max):
            if min is not None and root.val <= min:
                return False
            if max is not None and root.val >= max:
                return False
            if root.left:
                if root.val <= root.left.val:
                    return False
                if not dfs(root.left, min, root.val):
                    return False
            if root.right:
                if root.val >= root.right.val:
                    return False
                if not dfs(root.right, root.val, max):
                    return False
            return True

        return dfs(root, None, None)

