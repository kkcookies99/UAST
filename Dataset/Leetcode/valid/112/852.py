 class Solution(object):
    def XXX(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        if root is None:
            return False
        if root.left == None and root.right == None:
            if sum == root.val:
                return True
            else:
                return False

        
        return self.XXX(root.left, sum-root.val) or self.XXX(root.right, sum-root.val)

