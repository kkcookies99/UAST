 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        l = []
        self.visitNode(root, l)
        return l
        
    def visitNode(self, root, l):
        if root is None:
            return
        self.visitNode(root.left, l)
        l.append(root.val)
        self.visitNode(root.right, l)

