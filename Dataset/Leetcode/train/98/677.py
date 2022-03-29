 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root: return True
        self.pre = float('-inf')
        self.res = True
        
        def helper(root):
            if root:
                helper(root.left)
                if root.val<= self.pre: 
                    self.res = False
                self.pre = root.val
                helper(root.right)
        
        helper(root)
        return self.res

