 class Solution:
    def XXX(self, root):
        def dfs(root,left,right):
            if not root:
                return True
            elif left < root.val <right:
                return dfs(root.left,left,root.val) and dfs(root.right,root.val,right)
            else:
                return False
        return dfs(root,float('-inf'),float('inf'))

