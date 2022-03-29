class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root:
            return 0
        left, right = self.XXX(root.left), self.XXX(root.right)
        return 1 + min(left, right) if left and right else 1 + left + right

