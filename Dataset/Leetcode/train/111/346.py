class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root == None:
            return 0
        # None节点不参与比较
        if root.left != None and root.right == None:
            return 1 + self.XXX(root.left)
        if root.left == None and root.right != None:
            return 1 + self.XXX(root.right)
        return 1 + min(self.XXX(root.left), self.XXX(root.right))


