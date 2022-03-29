 class Solution(object):
    def maxDepth(self, root):
        if root == None:
            return 0
        if root.left == None and root.right == None:
            return 1
        else:
            return max(self.maxDepth(root.left) + 1, self.maxDepth(root.right) + 1)
    
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """       
        if root == None:
            return True
        
        if abs(self.maxDepth(root.left) - self.maxDepth(root.right)) <= 1:
            return self.XXX( root.right) and self.XXX( root.left)
        else:
            return False

