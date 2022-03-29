 class Solution:
    import sys
    tmp = -sys.maxsize # 没有给出边界，只能取系统的最小值了，始终记录着当前所访问节点的前驱的值
    
    def XXX(self, root: TreeNode) -> bool:
        """
        对于二叉排序树来说，中序遍历序列为递增有序序列。因此，对给定的二叉树进行中序遍历，
        如果能保证前一个值不比后一个值大，则证明该二叉树是一颗二叉排序树
        """            
        if not root:
            return True # 空树也是一颗二叉搜索树
        is_left_bst = self.XXX(root.left) # 遍历左子树
        # 判断左子树是否为二叉搜索树，或者判断 tmp 是否依次递增
        if not is_left_bst or self.tmp >= root.val:
            return False
        self.tmp = root.val # 将当前所访问节点的值赋值给 tmp
        return self.XXX(root.right) # 遍历右子树

