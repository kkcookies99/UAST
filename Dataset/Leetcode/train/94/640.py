 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        res = []
        if root == None:
            return res
        p = root
        se = []
        while p != None or len(se) != 0:
            if p != None:
                se.append(p)
                p = p.left
            else:
                p = se.pop()
                res.append(p.val)
                p = p.right
        return res

