class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        #BFS
        res,q = 0,[root] if root else []
        while q:
            res += 1
            q = [r for t in q for r in (t.left,t.right) if r]
        return res

