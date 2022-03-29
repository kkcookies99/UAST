 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        return self.height(root)>=0
    def height(self,root):
        if root == None:
            return 0
        left_height = self.height(root.left)
        right_height = self.height(root.right)
        if left_height >= 0 and right_height >=0 and abs(left_height-right_height)<=1:
            return max(left_height,right_height)+1
        else:
            return -1

