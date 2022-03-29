class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        def zcc(left,right):
            if not (left or right):
                return 0
            elif not left:
                return 1 + zcc(right.left,right.right)
            elif not right:
                return 1 + zcc(left.left,left.right)
            return 1 + max(zcc(left.left,left.right),zcc(right.left,right.right))
        return zcc(root.left,root.right)+1

