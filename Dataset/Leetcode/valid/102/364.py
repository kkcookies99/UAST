class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        
        queue = [root]
        res = []
        while queue:
            r = []
            num = len(queue)
            i = 0
            while i<num:
                point = queue.pop(0)
                r.append(point.val)
                if point.left:
                    queue.append(point.left)
                if point.right:
                    queue.append(point.right)
                i += 1
            res.append(r)
        return res

