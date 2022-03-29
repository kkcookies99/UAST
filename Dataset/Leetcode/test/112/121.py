class Solution(object):
    def XXX(self, root, sum):
        if not root:
            return False
        
        if not root.left and not root.right:
            return root.val == sum
        
        left = False
        if root.left:
            left = self.XXX(root.left, sum-root.val)
        if left:
            return True
        elif root.right:
            return self.XXX(root.right, sum-root.val)
        return False

