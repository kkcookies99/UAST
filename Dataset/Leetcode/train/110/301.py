class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root:return True
        def zcc(root):
            if not root:return 0
            return 1 + max(zcc(root.left),zcc(root.right))
        return self.XXX(root.left) and self.XXX(root.right) and abs(zcc(root.left)-zcc(root.right)) <= 1

