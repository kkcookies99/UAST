class Solution:
    def get_Height(self, root):
        """
        定义函数语义： 返回以root为根节点的二叉树的高度
        """

        if root == None:   # 递归终止条件
            return 0

        left_h = self.get_Height(root.left)
        right_h = self.get_Height(root.right)

        if abs(left_h - right_h) > 1:
            self.flag = False

        return max(right_h, left_h) + 1
 

    def XXX(self, root):
        self.flag = True
        self.get_Height(root)
        return self.flag

