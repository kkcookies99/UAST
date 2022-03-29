 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        if root == None: return []
        if root.left == None and root.right == None:
            return [root.val]
        return self.XXX(root.left) + [root.val] + self.XXX(root.right)
code block

