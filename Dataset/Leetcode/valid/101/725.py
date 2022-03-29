 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def check(l, r):
            if not l and not r: 
                return True
            if l and r and l.val == r.val:
                return check(l.left, r.right) and check(l.right, r.left)
            return False
        
        return check(root, root)

