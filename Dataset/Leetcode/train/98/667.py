 class Solution:
    def inorder(self, root):
        p = root
        res = []
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

    def XXX(self, root: TreeNode) -> bool:
        res = self.inorder(root)
        for i in range(1, len(res)):
            if res[i] <= res[i-1]:
                return False
        return True

