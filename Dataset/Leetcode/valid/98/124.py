 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return True
        stack, res = [], []
        while stack or root:
            if root:
                stack.append(root)
                root = root.left
            else:
                root = stack.pop()
                if res and root.val <= res[-1]:
                    return False
                else:
                    res.append(root.val)
                root = root.right
        return True

