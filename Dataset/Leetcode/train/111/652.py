 class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:return 0
        l1 = self.XXX(root.left)
        l2 = self.XXX(root.right)
        if root.left and root.right:
            return min(l1,l2)+1
        else:
            #若左子树或者右子树有一个为空或者都为空，那么返回的不应该是0+1，而应该是最大的加上1
            return max(l1,l2)+1

