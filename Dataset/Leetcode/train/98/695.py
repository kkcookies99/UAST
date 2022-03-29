 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def isvalid(node, lower, upper):
            if node == None: return True
            if not (lower < node.val < upper and isvalid(node.left, lower, node.val) and isvalid(node.right, node.val, upper)): return False
            return True
        return isvalid(root, -float('inf'), float('inf'))

