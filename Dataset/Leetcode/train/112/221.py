 class Solution:
    def XXX(self, root: Optional[TreeNode], targetSum: int) -> bool:
        self.result = False # 最终结果初始化为FALSE
        def recesive(pnum, node): # 自定义递归函数（截止当前父节点的总和，当前节点）
            if node is None: 
                return None
             # 递归终止条件2：如果当前节点是叶子节点，且加上父节点的和等于目标值，则直接设置返回值为True
            if node.left is None \
            and node.right is None \
            and node.val + pnum == targetSum:
                self.result = True
                return None 
            # 递归终止条件3：当前节点的左子节点是空，右子节点不是空，则继续加上当前节点的值
            if node.left is None and node.right is not None:
                recesive(pnum + node.val, node.right)
                return None
             # 递归终止条件4：当前节点的右子节点是空，左子节点不是空，则继续加上当前节点的值
            if node.right is None and node.left is not None:
                recesive(pnum + node.val, node.left)
                return None 
            recesive(pnum + node.val, node.left)  # 分别调用左子节点和右子节点
            recesive(pnum + node.val, node.right)
        recesive(0, root) # 调用递归函数，根节点的父节点的和设置为0
        return self.result

