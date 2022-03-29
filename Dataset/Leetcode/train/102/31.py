class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        ans, d = [], [root] if root else []
        while d:
            ans.append([t.val for t in d])
            d = [r for t in d for r in (t.left, t.right) if r]
        return ans

