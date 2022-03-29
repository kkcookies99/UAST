def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        queue = deque([root])
        index = 0
        while queue:
            length = len(queue)
            index += 1
            for _ in range(length):
                node = queue.popleft()
                if not node.left and not node.right:
                    return index 
                if  node.left:
                    queue.append(node.left)
                if  node.right:
                    queue.append(node.right)
            

