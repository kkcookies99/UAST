 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return True
        elif abs(self.depth(root.left)-self.depth(root.right)) > 1:
            return False
        return self.XXX(root.left) and self.XXX(root.right)
    
    def depth(self, node):
        if not node:
            return 0
        return max(self.depth(node.left), self.depth(node.right))+1

