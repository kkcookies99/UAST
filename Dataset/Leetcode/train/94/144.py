 class Solution(object):
    def XXX(self, root):
        if not root:
            return []
        ret, stack = [], []
        while len(stack) > 0 or root:
            if root:
                stack.append(root)
                root = root.left
            else:
                root = stack.pop()
                ret.append(root.val)
                root = root.right
        return ret

