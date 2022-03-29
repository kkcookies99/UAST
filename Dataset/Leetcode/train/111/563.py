class Solution:
    def XXX(self, root: TreeNode) -> int:
        ans = float('inf')
        def dfs(root,cur):
            nonlocal ans
            if(root is None):
                return
            if (root.left is None and root.right is None):
                ans = min(ans,cur)
            dfs(root.left,cur+1)
            dfs(root.right,cur+1)
        if root is None:
            return 0
        dfs(root,0)
        return ans+1

