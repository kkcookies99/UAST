class Solution:
    def XXX(self, root: TreeNode) -> int:
        res_depth = 0
        q = deque()
        if root is not None:
            q.append(root)
            res_depth += 1

        while len(q) > 0:
            count = len(q)
            for i in range(count):
                
                cur = q.popleft()
                if cur.left is None and cur.right is None:
                    return res_depth
                if cur.left is not None:
                    q.append(cur.left)

                if cur.right is not None:
                    q.append(cur.right)
            res_depth += 1

        return res_depth

