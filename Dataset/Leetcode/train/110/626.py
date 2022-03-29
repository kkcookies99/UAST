 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        return self.search(root) != -1
    def search(self, root):
        if not root:
            return 0
        l_left = self.search(root.left)
        if l_left == -1:
            return -1
        l_right = self.search(root.right)
        if l_right == -1:
            return -1
        if abs(l_right - l_left) > 1:
            return -1
        else:
            return max(l_left, l_right) + 1

