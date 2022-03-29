 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        stack = []
        res = []
        while stack or root:
            while root:
                stack.append(root)
                root = root.left
            cur = stack.pop()
            res.append(cur.val)
            root = cur.right
        return res

