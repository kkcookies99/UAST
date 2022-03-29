 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        return self.XXX(root.left)+[root.val]+self.XXX(root.right) if root else []

