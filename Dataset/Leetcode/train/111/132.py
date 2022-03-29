def XXX(self, root: TreeNode) -> int:
    if root is None:
        return 0

    m = 10 ** 5  # m为最小深度
    def bfs(d, node):
        nonlocal m
        if node.left is None and node.right is None:
            m = min(m, d)
            return
        bfs(d + 1, node.left) if node.left else None
        bfs(d + 1, node.right) if node.right else None

    bfs(1, root)
    return m

