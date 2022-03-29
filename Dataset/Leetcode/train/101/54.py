 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        self.bool = True
        def backtrack(root1, root2):
            if root1 is None and root2 is None:
                return
            if root1 is None or root2 is None:
                self.bool = False
                return
            if root1.val != root2.val:
                self.bool = False
                return
            if root1.left is None and root2.left is None and root1.right is None and root2.right is None:
                return

            if root1.right is not None and root2.left is not None:
                if root1.right.val == root2.left.val:
                    backtrack(root1.right, root2.left)
                else:
                    self.bool = False
                    return
            elif root1.right is not None and root2.left is None:
                self.bool = False
                return
            elif root1.right is None and root2.left is not None:
                self.bool = False
                return

            if root1.left is not None and root2.right is not None:
                if root1.left.val == root2.right.val:
                    backtrack(root1.left, root2.right)
                else:
                    self.bool = False
                    return
            elif root1.left is not None and root2.right is None: 
                self.bool = False
                return
            elif root1.left is None and root2.right is not None:
                self.bool = False
                return
        if root is None:
            return True
        else:
            backtrack(root.left, root.right)
        return self.bool

