 class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        d = [root] if root else []
        while d:
            yield [t.val for t in d]
            d = [r for t in d for r in (t.left, t.right) if r]

