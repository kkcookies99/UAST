 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def isSym(left,right):
            if left and right:
                return left.val == right.val and isSym(left.right, right.left) and isSym(left.left, right.right)
            else:
                return left == right
        return isSym(root, root)

