class Solution:
    def XXX(self, root: TreeNode) -> bool:
        self.result = True # 默认是平衡的
        def recursive(node): # 自定义递归函数
            if node is None: # 递归终止条件1：当前节点如果是空，直接返回0
                return 0  # 递归终止条件2：当前节点的左右子节点都是空，说明是叶子节点，直接返回1
            if node.left is None and node.right is None:
                return 1
            if node.left is None : # 如果当前节点只有右子节点，则直接返回右子节点的高度 + 1 
                dr = recursive(node.right) 
                if dr > 1: # 如果右子节点的高度大于1，则标记为不平衡二叉树
                    self.result = False 
                return dr + 1 
            if node.right is None : # 如果当前节点只有左子节点，则直接返回左子节点的高度 + 1 
                dl = recursive(node.left)
                if dl > 1: # 如果左子节点的高度大于1，则标记为不平衡二叉树
                    self.result = False 
                return dl + 1
            d1 = recursive(node.left) # 获取当前节点左右子节点的高度进行求差
            d2 = recursive(node.right)
            if abs(d1 - d2) > 1: # 差值大于1 标记为非平衡二叉树
                self.result = False 
            return max(d1, d2) + 1 # 返回截止当前节点的高度（注意：需要获取左右子节点中最高的那个）
        recursive(root) # 调用自定义的递归函数
        return self.result 

