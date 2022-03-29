 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        if root == None:
            return []
        left = self.XXX(root.left)
        right = self.XXX(root.right)
        return left + [root.val] + right

