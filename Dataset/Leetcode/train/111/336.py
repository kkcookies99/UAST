class Solution:
    def XXX(self, root: TreeNode):
        if not root: return 0
        res = 0
        queue = deque()
        queue.append(root)
        while queue:
            res += 1
            for _ in range(len(queue)):
                cur = queue.popleft()
                if cur.left: queue.append(cur.left)
                if cur.right : queue.append(cur.right)
                if not cur.left and not cur.right: return res
        return res

