class Solution:
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root == None:
            return 0
        return self.getDepth(root)
    
    def getDepth(self, root):
        if root == None:
            return 0
        if root.right == None:
            return self.getDepth(root.left)+1
        if root.left == None:
            return self.getDepth(root.right)+1
        l_height = self.getDepth(root.left)+1
        r_height = self.getDepth(root.right)+1
        if l_height<r_height:
            return l_height
        else: 
            return r_height

