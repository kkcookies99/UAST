class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        from collections import deque
        if not root: return 0
        q = deque()
        q.append((root, 0))
        level = 0

        while len(q) > 0:
            r, level = q.popleft()
            if r.left:
                q.append((r.left, level + 1))
            if r.right:
                q.append((r.right, level + 1))
            if r.left ==None and r.right==None:
                return level+1
        return  level+1

