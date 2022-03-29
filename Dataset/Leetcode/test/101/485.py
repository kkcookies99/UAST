 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def mirror(root1,root2):
            if not root1 and not root2:
                return True
            if not root1 or not root2:
                return False
            return root1.val==root2.val and mirror(root1.left,root2.right) and mirror(root1.right,root2.left)
        return mirror(root,root)

