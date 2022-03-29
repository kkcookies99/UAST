 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root == None:
            return 0
        if root.left == None and root.right == None:
            return 1
        return max(self.XXX(root.left), self.XXX(root.right))+1

