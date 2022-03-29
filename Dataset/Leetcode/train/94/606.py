 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        ans = []
        def inorder(root):
            if root is None:
                return
            inorder(root.left)
            ans.append(root.val)
            inorder(root.right)
        inorder(root)
        return ans

