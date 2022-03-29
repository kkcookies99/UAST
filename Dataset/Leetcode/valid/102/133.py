class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        tem_res = []
        res = []
        if root:
            tem_res.append([root, 0])
        while tem_res.__len__() > 0:
            te = tem_res.pop(0)
            if res.__len__() <= te[1]:
                res.append([])
            if te[0].left:
                tem_res.append([te[0].left, te[1]+1])
            if te[0].right:
                tem_res.append([te[0].right, te[1]+1])
            res[te[1]].append(te[0].val)
        return res


