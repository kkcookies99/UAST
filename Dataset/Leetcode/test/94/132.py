 class Solution(object):
    def preorderTraversal(self, root):
        if root is None:
            return []
        stack = []
        res = []
        stack.append(root)
        while len(stack) > 0:
            root = stack.pop()
            res.append(root.val)
            if root.right is not None:
                stack.append(root.right)
            if root.left is not None:
                stack.append(root.left)
        return res

