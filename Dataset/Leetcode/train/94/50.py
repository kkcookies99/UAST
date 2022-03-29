 class Solution:
    
    def XXX(self, root: TreeNode) -> list:
        global res
        res = list()
        if not root:
            return res
        def treetrack(root):
            if root.left:
                treetrack(root.left)
            global res
            res.append(root.val)
            if root.right:
                treetrack(root.right)
        treetrack(root)
        return res

