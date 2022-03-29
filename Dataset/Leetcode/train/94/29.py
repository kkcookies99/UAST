 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        def inorder(root, res):
            if root is None:
                return
            inorder(root.left, res)
            res.append(root.val)
            inorder(root.right, res)
        res = []
        inorder(root, res)
        return res

