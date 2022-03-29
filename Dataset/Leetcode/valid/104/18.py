class Solution:
    def XXX(self, root: TreeNode) -> int:
        if root == None:
            return 0
        Q = collections.deque([root])
        Q2 = collections.deque([])
        depth = 0
        while Q:
            depth += 1
            while Q:
                r = Q.pop()
                if r.left:
                    Q2.append(r.left)
                if r.right:
                    Q2.append(r.right)
            while Q2:  
                Q.append(Q2.popleft())
        return depth

