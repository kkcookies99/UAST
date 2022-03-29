 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        inorder = self.inorder(root)
        return inorder == list(sorted(set(inorder)))
    
    def inorder(self, root):
        if not root: return []
        return self.inorder(root.left) + [root.val] + self.inorder(root.right)

