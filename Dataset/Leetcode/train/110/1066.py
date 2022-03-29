 class Solution:
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if root == None: return True
        lh = self.getHeight(root.left)
        rh = self.getHeight(root.right)
        
        if abs(lh - rh) > 1 : return False
        return self.XXX(root.left) and self.XXX(root.right)
        
    def getHeight(self, root):
        if root == None: return 0
        return max(self.getHeight(root.left), self.getHeight(root.right)) + 1

