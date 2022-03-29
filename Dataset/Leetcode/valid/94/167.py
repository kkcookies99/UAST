 class Solution:
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        l = []
        if root == None: # 判断空树
            return l
        if root.left != None:
            l += self.XXX(root.left)
        if root.val != None:  
            l.append(root.val) 
        if root.right != None:
            l += self.XXX(root.right)
        return l

