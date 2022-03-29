 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        ans, stack = [], []
        p = root
        while p or stack:
            if p :
                stack.append(p)
                p = p.left
            else:
                p = stack.pop()
                ans.append(p.val)
                p = p.right
        return ans

