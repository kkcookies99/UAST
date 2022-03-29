class Solution:
    def XXX(self, root: TreeNode) -> int:
        if root is None:
            return 0
        global res
        res = 0
        def getDeep(deep, node):
            if node is None: return
            global res
            if deep > res:
                res = deep
            getDeep(deep + 1, node.right)
            getDeep(deep + 1, node.left)
        getDeep(0, root)
        return res+1

