 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return True
        res = self.getResult(root)
        if res>=2**31-1:
            return False
        else:
            return True
        
    def getResult(self,root):
        if not root:
            return 0
        left= self.getResult(root.left)+1
        right = self.getResult(root.right)+1
        if abs(left-right)>1:
            return 2**31-1
        else:
            return max(left,right)

