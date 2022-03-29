 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        if not root: return []
        stack, res = [], []
        while  root or stack:
            while root:
                stack.append(root)
                root = root.left
            root = stack.pop(-1)
            res.append(root.val)
            root = root.right
        return res

