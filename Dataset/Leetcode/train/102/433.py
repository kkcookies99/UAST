class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        res = []
        queue = [root]
        while(queue):
            tmp = []
            n = len(queue)
            while(n>0):
                cur = queue.pop(0)
                tmp.append(cur.val)
                if cur.left:
                    queue.append(cur.left)
                if cur.right:
                    queue.append(cur.right)
                n -= 1
            res.append(tmp)
        return res

