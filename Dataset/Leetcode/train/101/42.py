 class Solution:
    def recursion_Method(self, root1, root2):
        """
        函数语义：判断以root1 和 root2 为根节点的两棵二叉树是否镜像对称
        """
        if root1 == None and root2 == None:
            return True

        if (root1 == None and root2 != None) or (root1 != None and root2 == None) or (root1.val != root2.val):
            return False
        
        return self.recursion_Method(root1.left, root2.right) and self.recursion_Method(root1.right, root2.left)        
        
    def XXX(self, root):    
        """
        判断一棵树是否是镜像的，就判断以root为根节点的左右子树是否为镜像对称即可
        镜像对称的要求是某两个节点的左孩子等于右孩子
        """
        if root == None:
            return True
        return self.recursion_Method(root.left, root.right)

