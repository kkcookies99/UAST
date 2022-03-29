 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        def isSame(node1, node2):
            if (node1 is None) and (node2 is None):
                return True
            if node1 and node2:
                if node1.val == node2.val:
                    return isSame(node1.left, node2.left) and \
                    isSame(node1.right, node2.right)
            return False
        
        return isSame(p, q)

