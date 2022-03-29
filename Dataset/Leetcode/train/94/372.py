 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        ans, s, p = [], [], root
        while s or p:
            while p:
                s.append(p)
                p = p.left
            if s:
                p = s.pop()
                ans.append(p.val)
                p = p.right
        return ans

