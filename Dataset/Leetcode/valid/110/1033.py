 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if root==None:
            return True
        return abs(self.sumTreeHeight(root.left)-self.sumTreeHeight(root.right))<2 and self.XXX(root.left) and self.XXX(root.right)
    
    
    def sumTreeHeight(self,root):
        if root==None:
            return 0
        return max(self.sumTreeHeight(root.left),self.sumTreeHeight(root.right))+1

