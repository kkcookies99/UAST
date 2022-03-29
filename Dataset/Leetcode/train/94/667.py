 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        if not root:return []
        stack, res, r = [], [], root
        while stack or r:
            while r:
                stack.append(r)
                r = r.left
            r = stack.pop()
            res.append(r.val)
            r = r.right
        return res

