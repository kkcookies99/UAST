class Solution:
    def XXX(self, root: TreeNode) -> bool:

        def f(node):
            if not node:
                return True, 0
            a, b = f(node.left)
            c, d = f(node.right)
            return a and c and abs(b - d) <= 1, max(b, d) + 1

        ans, _ = f(root)
        return ans

