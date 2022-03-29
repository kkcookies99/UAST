 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def dfs(root: TreeNode):
            nonlocal pre, flag
            if not root or not flag: return
            dfs(root.left)
            if root.val <= pre: flag = False
            pre = root.val
            dfs(root.right)
        
        flag = True
        pre = -1e19
        dfs(root)
        return flag

