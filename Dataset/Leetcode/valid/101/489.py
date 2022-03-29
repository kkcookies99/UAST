 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if root==None:
            return True
        l_n=root
        r_n=root
        def think(l_n,r_n):
            if not l_n and not r_n:
                return True
            elif not l_n or not r_n:
                return False
            if l_n.val!=r_n.val:
                return False
            else:
                return think(l_n.left,r_n.right) and think(l_n.right,r_n.left)
        
        return think(l_n,r_n)

