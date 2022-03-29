class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def dfs(root):
            if not root: return 0
            leftH,rightH = dfs(root.left),dfs(root.right)
            return 1 + max(leftH, rightH) if leftH>=0 and rightH>=0 and abs(leftH-rightH)<=1 else -1
        return True if dfs(root)>=0 else False

