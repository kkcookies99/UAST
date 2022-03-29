class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        queue = deque([(root, 1)])
        while queue:
            node, height = queue.popleft()
            if not node.left and not node.right:
                return height
            if node.left:
                queue.append((node.left, height+1))
            if node.right:
                queue.append((node.right, height+1))

