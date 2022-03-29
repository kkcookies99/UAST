 class Solution:
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return True
        elif abs(self.height(root.left)-self.height(root.right))>1:
            return False
        return self.XXX(root.left) and self.XXX(root.right)
        
    def height(self,root):
        if not root:return 0;
        return max(self.height(root.left),self.height(root.right))+1

