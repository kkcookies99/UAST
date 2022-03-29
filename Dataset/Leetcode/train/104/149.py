class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root: return 0
        stack,ans = [(root,1)],0
        while stack:
            p, lv = stack.pop()
            ans = max(lv,ans)
            if p.left:
                stack.append((p.left,lv+1))
            if p.right:
                stack.append((p.right,lv+1))
        return ans 

