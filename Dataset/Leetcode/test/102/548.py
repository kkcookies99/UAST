class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        ans, level = [], root and [root]
        while level:
            ans.append([x.val for x in level])
            level = [k for x in level for k in (x.left, x.right) if k]
        return ans

