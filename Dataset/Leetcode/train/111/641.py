 class Solution:
    def XXX(self, root: TreeNode) -> int:
        deep = 0
        if root == None:
            return deep
        se = []
        se.append(root)
        while len(se) != 0:
            deep += 1
            tmp = []
            while len(se) != 0:
                p = se.pop(0)
                if p.left == None and p.right == None:
                    return deep
                if p.left != None:
                    tmp.append(p.left)
                if p.right != None:
                    tmp.append(p.right)
            se = tmp[:]
        return deep

