class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        q = [root]
        res = []
        while q:
            next_q = []
            temp = []
            for i in q:
                if i:
                    next_q.append(i.left)
                    next_q.append(i.right)
                    temp.append(i.val)
            q = next_q
            if temp:
                res.append(temp)
        return res

