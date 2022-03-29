 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        pre = 1-2**32
        stack = []
        while root or stack:
            while root:
                stack.append(root)
                root = root.left
            if stack:
                t = stack.pop()
                if t.val<=pre:
                    return False
                pre = t.val
                root = t.right
        return True

