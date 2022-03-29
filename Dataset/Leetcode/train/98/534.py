 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def helper(root):
            if not root:
                return []
            return helper(root.left)+[root.val]+helper(root.right)
        temp = helper(root)
        return temp==list(sorted(set(temp)))

