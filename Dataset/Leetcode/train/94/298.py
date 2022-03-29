 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        def XXXGen(root):
            if root is not None:
                yield from XXXGen(root.left)
                yield root.val
                yield from XXXGen(root.right)
        return list(XXXGen(root))

