class Solution(object):
    def XXX(self, root):

        if root == None:
            return 0
            
        queue = [root]
        c = 0

        while queue:
            n = len(queue)
            c += 1
            for i in range(n):
                q = queue.pop(0)
                if q:
                    if not q.left and not q.right:
                        return c
                    queue.append(q.left)
                    queue.append(q.right)

