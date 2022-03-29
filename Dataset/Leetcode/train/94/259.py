 class Solution(object):
    def XXX(self, root):
        cur   = root
        stack = []
        res   = []
        while cur or stack:
            if cur:
                stack.append(cur)
                cur = cur.left
            else:
                cur = stack.pop()
                res.append(cur.val)
                cur = cur.right
        
        return res

