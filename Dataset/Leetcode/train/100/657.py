 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        self.ans = True
        self.dfs(p, q)
        return self.ans
    def dfs(self, p: TreeNode, q: TreeNode) -> None:
        if(p or q):
            if(p == None and q):
                self.ans = False
                return
            elif(p and q == None):
                self.ans = False
                return
            elif(p and q and p.val != q.val):
                self.ans = False
                return
            self.dfs(p.left if p else None, q.left if q else None)
            self.dfs(p.right if p else None, q.right if q else None)

