class Solution:
    def XXX(self, root: TreeNode) -> bool:
        h, flag = self.is_Balanced(root)
        return flag
    def is_Balanced(self, root: TreeNode) -> (int, bool):
        if not root:
            return (0, True)
        else:
            hl, fl = self.is_Balanced(root.left)
            hr, fr = self.is_Balanced(root.right)
            if fl and fr and abs(hl - hr) <= 1:
                return (max(hl, hr) + 1, True)
            else:
                return (max(hl, hr) + 1, False)

