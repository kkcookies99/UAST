 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        return self.preOrder(p) == self.preOrder(q)

    def preOrder(self, root):
        if not root:
            return ["null"]
        return [root.val] + self.preOrder(root.left) + self.preOrder(root.right)

