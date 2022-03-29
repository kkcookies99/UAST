 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        def travers(root):
            if None == root:
                return
            yield from travers(root.left)
            yield root.val
            yield from travers(root.right)

        return list(travers(root))

