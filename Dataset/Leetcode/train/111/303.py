class Solution:
    ans = 1000001
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
    
        def helper(node, depth):
            if self.ans < depth:
                return 

            if not node.left and not node.right:
                if self.ans > depth:
                    self.ans = depth
            
            if node.left:
                helper(node.left, depth + 1)
            
            if node.right:
                helper(node.right, depth + 1)

        helper(root, 1)
        return self.ans

