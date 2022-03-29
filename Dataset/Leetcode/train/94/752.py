 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        if root is None:
            return []
        return self.XXX(root.left) + [root.val] + self.XXX(root.right)

