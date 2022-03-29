 class Solution:
    def XXX(self, root: TreeNode, min_=float("-inf"), max_=float("inf")) -> bool:
        return (not root) or ((min_ < root.val < max_) and self.XXX(root.left, min_, root.val) and self.XXX(root.right, root.val, max_))

