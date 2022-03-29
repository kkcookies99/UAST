class Solution:
    def XXX(self, root: TreeNode) -> int:
        level = 0
        queue = collections.deque()
        queue.append(root)
        res = []
        while(queue):
            n = len(queue)
            for _ in range(n):
                cur = queue.popleft()
                if not cur:
                    continue
                queue.append(cur.left)
                queue.append(cur.right)
            level += 1
        return level - 1

