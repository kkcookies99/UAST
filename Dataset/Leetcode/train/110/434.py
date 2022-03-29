class Solution:
    def XXX(self, root: TreeNode) -> bool:
        self.result = True
        def height(root):
            if not root:
                return 0
            
            left = height(root.left)
            right = height(root.right)
            if root.left:
                left += 1
            if root.right:
                right += 1
            if abs(left - right) > 1:
                self.result = False

            return max(left, right)

        height(root)
        return self.result

