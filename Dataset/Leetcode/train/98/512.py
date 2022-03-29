 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        pre = None
        for seq in self.sequence(root):
            if pre != None and pre >= seq:
                return False
            else:
                pre = seq
        return True

    def sequence(self, root: TreeNode):
        if root.left:
            yield from self.sequence(root.left)
        yield root.val
        if root.right:
            yield from self.sequence(root.right)

