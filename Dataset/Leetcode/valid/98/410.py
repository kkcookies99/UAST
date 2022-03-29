 class Solution:
    def getMax(self, root):
        """
        返回以root为根节点的二叉搜索树的最大值
        """
        if root == None:
            return -float("INF")
        
        while root.right != None:
            root = root.right

        return root.val

    def getMin(self, root):
        """
        返回以root为根节点的二叉搜索树的最小值
        """
        if root == None:
            return float("INF")

        while root.left != None:
            root = root.left

        return root.val
    
    def XXX(self, root):
        """
        定义递归语义：返回以root为根节点的二叉树是否是二叉搜索树
        """
        # 需要验证空节点是否是二叉搜索树
        if root == None:
            return True

        left = self.XXX(root.left)
        right = self.XXX(root.right)

        if root.val < self.getMin(root.right) and root.val > self.getMax(root.left):
            cur = True
        else:
            cur = False

        return cur and left and right

