 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def inorder(root, res):
            if root is None:
                return None
            inorder(root.left, res)
            res.append(root.val)
            inorder(root.right, res)
        res = []
        inorder(root, res)
        return res == sorted(res) and len(set(res)) == len(res)

