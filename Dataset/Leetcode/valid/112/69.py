class Solution:
    def XXX(self, root: TreeNode, sum: int) -> bool:
        if not root:return False
        stack = [[root, sum-root.val]]
        while stack:
            r = stack.pop()
            if r[1] == 0 and not r[0].left and not r[0].right:
                return True
            if r[0].right:
                stack.append([r[0].right, r[1]-r[0].right.val])
            if r[0].left:
                stack.append([r[0].left, r[1]-r[0].left.val])
        return False

