class Solution:
    def XXX(self, root: TreeNode) -> int:
        return max(self.XXX(root.left), self.XXX(root.right)) + 1  if (root != None) else 0

