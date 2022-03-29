class Solution:
    def __init__(self):
        self.max_num = 0

    def XXX(self, root: TreeNode) -> int:
        if root is None: return 0
        l = self.XXX(root.left)
        r = self.XXX(root.right)
        
        self.max_num = max (max(l, r)+1, self.max_num)
        
        return self.max_num 

