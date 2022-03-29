class Solution:
    def XXX(self, root: TreeNode) -> int:
        if(root==None):
            return 0
        else:
            return max(self.XXX(root.left),self.XXX(root.right))+1

