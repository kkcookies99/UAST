 class Solution:
    def get_sub_XXX(self, root):
        if root == None: return 0
        if root.left == None and root.right == None:
            return 1
        return 1 + max(self.get_sub_XXX(root.left), self.get_sub_XXX(root.right))

    def XXX(self, root: 'TreeNode') -> 'int':
        return self.get_sub_XXX(root)

