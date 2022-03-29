class Solution:
    def XXX(self, root: TreeNode) -> int:
        def helper(node, depth):
            if node:
                return max(helper(node.left, depth+1), helper(node.right, depth+1))
            else:
                return depth
                
        return helper(root, 0)

