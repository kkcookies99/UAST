 class Solution(object):
    def XXX(self, root, sum):
        if not root:
            return False
        elif not root.left and not root.right and root.val == sum:
            return True
        else:
            return self.XXX(root.left, sum - root.val) or  self.XXX(root.right, sum - root.val)
        

