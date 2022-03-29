class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        def height(root):
            if not root:
                return 0
            left = height(root.left)
            right = height(root.right)
            if abs(left-right) > 1  or left < 0 or right < 0:
                return -1
            return 1 + max(left, right)

        if not root:
            return True

        return height(root) > 0

