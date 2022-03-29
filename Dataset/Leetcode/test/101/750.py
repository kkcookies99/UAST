 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        res1 = []
        res2 = []
        # 前序
        def preorder(tree, res):
            if tree == None:
                res.append(None)
                return
            res.append(tree.val)
            preorder(tree.left, res)
            preorder(tree.right, res)

        # 后序
        def postorder(tree, res):
            if tree == None:
                res.append(None)
                return
            postorder(tree.left, res)
            postorder(tree.right, res)
            res.append(tree.val)

        preorder(root, res1)
        postorder(root, res2)
        res2.reverse()
        if res1 == res2:
            return True
        else:
            return False

