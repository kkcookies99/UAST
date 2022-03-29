class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if root is None: return []
        res = []
        queue = [root]
        while queue:
            tmp = []
            size = len(queue)

            while size:
                q = queue.pop(0)
                tmp.append(q.val)
                if q.left:
                    queue.append(q.left)
                if q.right:
                    queue.append(q.right)
                size -= 1
            res.append(tmp)
        return res

