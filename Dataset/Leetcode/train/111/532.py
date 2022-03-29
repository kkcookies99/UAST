class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        def fun(node):
            if not node: return 0x3f3f3f
            if not node.left and not node.right: return 1
            return min(fun(node.left),fun(node.right))+1
        return fun(root)

