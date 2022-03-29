class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def dfs(root):
            if root==None:return 0
            a,b=1+dfs(root.left),1+dfs(root.right)
            if a==0 or b==0:return -1
            if a-b==1 or a-b==-1 or a-b==0:return max(a,b)
            else:return -1
        a=dfs(root)
        if a!=-1:return True
        return False

