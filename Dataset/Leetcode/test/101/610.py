 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        x1 = self.zx(root)
        x2 = self.jx(root)
        return x1 == x2
    def zx(self, root):
        if not root:
            return ['null']
        return self.zx(root.left) + [root.val] + self.zx(root.right)
    def jx(self, root):
        if not root:
            return ['null']
        return self.jx(root.right) + [root.val] + self.jx(root.left)

