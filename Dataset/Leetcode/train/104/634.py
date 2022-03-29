 class Solution:
    def XXX(self, root: 'TreeNode') -> 'int':
        if(root is None):
            return 0
        return(max(self.XXX(root.left),self.XXX(root.right))+1)

