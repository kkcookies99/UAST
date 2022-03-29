 class Solution:
    def look(self, node):
        if node is None: return True
        if not self.look(node.left):
            return False
        if self.pre is not None and self.pre >= node.val:
            return False
        self.pre = node.val
        return self.look(node.right)

    def XXX(self, root: TreeNode) -> bool:
        if not root: return True
        # 中序遍历，优化版
        self.pre = None
        return self.look(root)

