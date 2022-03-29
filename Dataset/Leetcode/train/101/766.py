 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        return self.A(root,root)

    def A(self,tree1,tree2)  :
        if  not tree1 and not tree2 : 
            return True 
        if  not tree1 or not tree2 :  
            return False
        return (tree1.val == tree2.val) and self.A(tree1.left , tree2.right) and self.A(tree1.right ,tree2.left)

