 class Solution:
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        # Python列表可以相加 [1,2]+[]+[3,4] = [1,2,3,4]
        if root==None:
            return []
        return self.XXX(root.left)+[root.val]+self.XXX(root.right)