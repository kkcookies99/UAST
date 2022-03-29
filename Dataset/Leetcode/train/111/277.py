class Solution:
    def XXX(self, root: TreeNode) -> int:
        if root is None:
            return 0
        # 左右都没有值，则该节点就是叶子节点了  直接返回1
        if root.left is None and root.right is None:
            return 1
        # 当前节点只有右子节点，直接返回右子节点的最小值    
        if root.left is None and root.right is not None:
            return 1 + self.XXX(root.right)
        # 当前节点只有左子节点，直接返回左子节点下面的最小值   
        if root.right is None and root.left is not None:
            return 1 + self.XXX(root.left)
        # 返回左、右子节点的最小值
        return min(self.XXX(root.left) + 1, self.XXX(root.right) + 1)

