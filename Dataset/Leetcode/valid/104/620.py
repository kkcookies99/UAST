 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root == None:
            return 0
        return max(self.high(root.right), self.high(root.left)) + 1
    
    
    def high(self, root):
        if root == None:
            return 0
        return max(self.high(root.left), self.high(root.right)) + 1

