 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        ans = []
        s = [(root, '>')]
        while len(s) > 0:
            p, d = s.pop()
            if p is None:
                continue
            if d == '>':
                s.append((p.right, '>'))
                s.append((p, '<'))
                s.append((p.left, '>'))
            else:
                ans.append(p.val)
        return ans

