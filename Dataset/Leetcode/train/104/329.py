class Solution:
    def get_Depth(self, root, d):
        # 定义递归终止条件
        if root == None:
            return 

        # 更新最大深度
        if d > self.depth:
            self.depth = d

        # 访问其左右子树
        self.get_Depth(root.left, d + 1)
        self.get_Depth(root.right, d + 1)

    def XXX(self, root):
        self.depth = 0
        self.get_Depth(root, 1)    # 定义get_Depth的语义：访问以root为根节点的二叉树并携带当前深度， 1为初始深度
        return self.depth   

