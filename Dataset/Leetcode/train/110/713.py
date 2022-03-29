 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        ans=True
        def f(r):
            if not r:
                return 0
            l=f(r.left)
            r=f(r.right)
            if abs(l-r)>1:
                nonlocal ans
                ans=False
            return max(l,r)+1
        f(root)
        return ans

