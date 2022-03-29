class Solution:
    def XXX(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if root == None:
            return False
        self.target = targetSum
        self.ans = False
        self.dfs(root, 0)
        return self.ans

    def dfs(self, r, sumNum):
        if not r.left and not r.right:
            if sumNum + r.val == self.target:
                self.ans = True
        else:
            if r.left:
                self.dfs(r.left,  sumNum + r.val)
            if r.right:
                self.dfs(r.right, sumNum + r.val)

