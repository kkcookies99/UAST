class Solution:
    def XXX(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        if not root:
            return False

        if not root.left and not root.right and root.val == sum:
            return True

        sum -= root.val

        return self.XXX(root.left, sum) or self.XXX(
            root.right, sum)

