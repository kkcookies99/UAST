 class Solution:
    def XXX(self, root: TreeNode) -> bool:

        def helper(node, low, high):
            if node.left is None and node.right is None:
                return True
            elif node.left is not None and node.right is None:
                if node.left.val >= node.val or node.left.val <= low or node.left.val >= high:
                    return False
                else:
                    return helper(node.left, low, node.val)
            elif node.left is None and node.right is not None:
                if node.right.val <= node.val or node.right.val <= low or node.right.val >= high:
                    return False
                else:
                    return helper(node.right, node.val, high)
            elif node.left is not None and node.right is not None:
                if node.left.val >= node.val or node.left.val <= low or node.left.val >= high:
                    return False
                if node.right.val <= node.val or node.right.val <= low or node.right.val >= high:
                    return False
                return helper(node.left, low, node.val) and helper(node.right, node.val, high)
        
        high = float('inf')
        low = float('-inf')
        return helper(root, low, high)

