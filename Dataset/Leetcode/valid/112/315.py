 class Solution:
    def XXX(self, root, targetSum):
        """
        定义函数的语义: 返回以root为根节点的二叉树中是否存在由根节点到叶子节点的路径和等于targetSum
        """
        if root == None:        # 如果root为空， 则永远不可能找到任意一个targetSum
            return False

        if root.left == None and root.right == None and root.val == targetSum:
            return True

        # 既然是找路径， 那么路径经过root时候， 就是减去其值，然后在子树中寻找剩下的值的大小
        return self.XXX(root.left, targetSum - root.val) or self.XXX(root.right, targetSum - root.val)

