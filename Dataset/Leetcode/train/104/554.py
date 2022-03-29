class Solution:
    def XXX(self, root: TreeNode) -> int:
        if root is None:
            return 0
        current = 0
        max_depth = current

        def next(node, current):
            nonlocal max_depth
            if node is not None:
                current += 1
                if max_depth < current:
                    max_depth = current
                next(node.left, current)
                next(node.right, current)

            return

        next(root, current)
        return max_depth

