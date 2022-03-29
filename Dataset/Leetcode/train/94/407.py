 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        if not root:
            return []
        return self.XXX(root.left)+[root.val]+self.XXX(root.right)

