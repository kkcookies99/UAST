 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        ans = []
        def inorder(root):
            if root is None:
                return
            inorder(root.left)
            ans.append(root.val)
            inorder(root.right)
        inorder(root)
        if len(set(ans)) != len(ans):
            return False
        return sorted(ans) == ans

