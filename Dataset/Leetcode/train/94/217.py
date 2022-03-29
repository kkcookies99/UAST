 class Solution:
    ans=[]
    def XXX(self, root: TreeNode) -> List[int]:
        self.ans=[]
        self.inorder(root)
        return self.ans
    def inorder(self,root):
        if root==None:
            return
        self.inorder(root.left)
        self.ans.append(root.val)
        self.inorder(root.right)

