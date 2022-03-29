 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        '''
        使用递归解法
        递归一个镜像函数,判断两个子节点是否镜像
        递归终止条件：左右子树为空，返回True
        递归函数主体：判断左右两颗子树是否满足镜像条件:左子树的左之树和右子树的右子树对称，左子树的右子树和右子树的左子树对称
        '''
        #日常判断是否为空
        if not root: return True
        
        #判断根节点的两个子节点是否镜像
        return self.is_mirror(root.left,root.right)
    
    def is_mirror(self,left_node,right_node):
        
        #以下是递归终止条件：1.两个结点都为空 2.只有一个节点
        if not left_node and not right_node: return True
        if (not left_node) or (not right_node) : return False
        
        #判断两个结点的子结点是否满足镜像条件
        left = self.is_mirror(left_node.left,right_node.right)
        right = self.is_mirror(left_node.right,right_node.left)
        #记住判断的是值val
        return left_node.val == right_node.val and left and right

