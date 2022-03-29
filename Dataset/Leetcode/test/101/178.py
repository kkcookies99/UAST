 class Solution:
    def XXX(self, root: TreeNode) -> bool:

        def XXXTree(node1, node2):
            if (node1 is None) and (node2 is None):
                return True
            if node1 and node2:
                if node1.val == node2.val:
                    return XXXTree(node1.left, node2.right) \
                    and XXXTree(node1.right, node2.left)
            return False

        if root is not None:
            return XXXTree(root.left, root.right)
        else:
            return False

