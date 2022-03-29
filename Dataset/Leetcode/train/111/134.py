def XXX(self, root: TreeNode) -> int:
    m = 0
    queue = deque()  
    queue.append(root) if root else None

    while queue:
        m += 1
        for i in range(len(queue)):
            node = queue.popleft()
            queue.append(node.left) if node.left else None
            queue.append(node.right) if node.right else None
            # 如果遇到叶子节点，直接返回层数，即是最小深度
            if node.left is None and node.right is None:
                return m
    
    return m

