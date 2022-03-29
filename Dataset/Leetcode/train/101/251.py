 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root: return True
        a, b = [root], [root]
        while a and b:
            left, right = a.pop(), b.pop()
            if left.val != right.val: return False
            if left.left and right.right:
                a.append(left.left)
                b.append(right.right)
            if left.right and right.left:
                a.append(left.right)
                b.append(right.left)
            if (left.left and not right.right) or (left.right and not right.left):
                return False
            if (not left.left and right.right) or (not left.right and right.left):
                return False
        return True

