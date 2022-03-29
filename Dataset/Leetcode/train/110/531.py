class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def helper(root):
            if not root:
                return True,0
            boolean1,h1 = helper(root.left)
            boolean2,h2 = helper(root.right)
            if boolean1 and boolean2 and abs(h1-h2)<=1:
                return True, max(h1,h2)+1
            return False,0
        return helper(root)[0]

