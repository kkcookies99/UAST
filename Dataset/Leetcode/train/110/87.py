class Solution:
    def height(self,root:TreeNode) -> int:
        if root == None: return 0
        return max(self.height(root.left),self.height(root.right))+1
    def XXX(self, root: TreeNode) -> bool:
        if root == None: return True
        return self.XXX(root.left) and self.XXX(root.right) and abs(self.height(root.left)-self.height(root.right))<=1

