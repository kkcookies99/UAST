 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        return [] if not root else self.XXX(root.left) + [root.val] + self.XXX(root.right)

