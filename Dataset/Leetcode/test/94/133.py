 class Solution(object):
    def XXX(self, root):
        if root is None:
            return []
        stack = []
        res = []
        stack.append(root)
        while len(stack) > 0:
            root = stack[-1]
            if root.left is None:
                res.append(root.val)
                stack.pop()
                if root.right is not None:
                    stack.append(root.right)
            else:
                stack.append(root.left)
                root.left = None
        return res

