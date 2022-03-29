 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        def check(node1, node2):
            if not node1 and not node2:
                return True
            elif not node1 or not node2:
                return False
            
            if node1.val != node2.val:
                return False
            return check(node1.left, node2.right) and check(node1.right, node2.left)
        
        return check(root, root)

