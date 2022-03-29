 class Solution(object):
    def XXX(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        if root is None:
            return False
        if root.left is None and root.right is None:
            return True if root.val == sum else False
        return self.XXX(root.left, sum - root.val) or self.XXX(root.right, sum - root.val)

