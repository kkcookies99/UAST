class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        q = deque([root])
        level = 0
        while q:
            q_next = deque()
            level += 1
            for _ in range(len(q)):
                node = q.popleft()
                if node.left:
                    q_next.append(node.left)
                if node.right:
                    q_next.append(node.right)
            q = q_next
        return level

