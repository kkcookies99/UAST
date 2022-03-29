 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        def mid(root):
            if root == None:
                return []
            else:
                return mid(root.left) + [root.val] + mid(root.right)
        return mid(root)

