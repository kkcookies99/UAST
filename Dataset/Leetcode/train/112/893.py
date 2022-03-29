 class Solution(object):
    def XXX(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        if not root:return False
        if not root.right and not root.left:
            if root.val==sum:return True
            else:return False
        else:    
            return self.XXX(root.left,sum-root.val) or self.XXX(root.right,sum-root.val) 

