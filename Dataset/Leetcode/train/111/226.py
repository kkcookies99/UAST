class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        deq = deque([(root,1)])
        while deq:
            cur,depth = deq.popleft()
            if not cur.right and not cur.left:
                return depth
            if cur.left: deq.append((cur.left,depth+1))
            if cur.right:deq.append((cur.right,depth+1))
        return 0

