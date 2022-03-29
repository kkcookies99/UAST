 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        ans = []
        f = lambda r: r and (f(r.left) or ans.append(r.val) or f(r.right))
        f(root)
        return ans

