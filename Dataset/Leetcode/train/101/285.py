 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def func(root1, root2):
            try:
                if root1.val == root2.val:
                    return func(root1.left, root2.right) and func(root1.right, root2.left)
                else:
                    return False
            except:
                if root1 == None and root2 == None:
                    return True
                else:
                    return False
        return func(root.left, root.right)

