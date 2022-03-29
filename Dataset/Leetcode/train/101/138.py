 class Solution(object):
    def XXX(self, root):
        if not root:
            return True
        def mirror(left,right):
            if not left and not right:
                return True
            if (left and not right) or (not left and right):
                return False
            if left.val!=right.val:
                return False
            return mirror(left.left,right.right) and mirror(left.right,right.left)
        return mirror(root.left,root.right)

