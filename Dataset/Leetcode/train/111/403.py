class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        ans = 0
        q = collections.deque()
        q.append(root)
        while len(q):
            s = len(q)
            ans += 1
            for _ in range(s):
                n = q.popleft()
                if not n.left and not n.right:
                    return ans
                if n.left:
                    q.append(n.left)
                if n.right:
                    q.append(n.right)
        return ans

