class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        left=self.XXX(root.left)
        right=self.XXX(root.right)
        return max(left,right)+1

