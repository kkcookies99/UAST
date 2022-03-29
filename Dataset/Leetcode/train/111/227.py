class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        depth = 0
        s = collections.deque([root])
        while s:
            n = len(s)
            depth += 1
            for i in range(n):
                temp = s.popleft()
                if temp.left:
                    s.append(temp.left)
                if temp.right:
                    s.append(temp.right)
                if not temp.left and not temp.right:
                    return depth

