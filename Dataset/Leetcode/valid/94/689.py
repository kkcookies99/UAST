 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:  
        # if not root: return []
        # mid = root.val
        # left = self.XXX(root.left)
        # right = self.XXX(root.right)
        # return left + [mid] + right
        stack = []
        p = root
        stack, res = [], []
        while p or stack:
            if p:
                stack.append(p)
                p = p.left
            else:
                p = stack.pop()
                res.append(p.val)
                p = p.right
        return res


