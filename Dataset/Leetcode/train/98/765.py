 class Solution:
    pre = -2**63
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return True
        if not self.XXX(root.left):
            return False
        if root.val <= Solution.pre:
            return False
        Solution.pre = root.val
        return self.XXX(root.right)

