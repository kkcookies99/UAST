 class Solution(object):
    flag = False # 全局标志：表示是否存在一条路径数值加和等于目标值
    def sumPath(self, node, curSum, targetSum):
        """
        :param node: 当前节点
        :param curSum: 到当前节点之前的节点数值总和
        :param targetSum: 目标总和
        :return:
        """
        if node == None:
            return
        # 如果到达叶子节点，则进行总和判断
        if node.left == None and node.right == None:
            if curSum + node.val == targetSum:
                self.flag = True
        self.sumPath(node.left,curSum+node.val,targetSum)
        self.sumPath(node.right, curSum + node.val, targetSum)

    def XXX(self, root, targetSum):
        """
        :type root: TreeNode
        :type targetSum: int
        :rtype: bool

        核心思想：
            采用DFS，每当遇到叶子结点，就去计算当前路径总和，如果等于targetSum就将全局标志flag设置为True
        """
        self.sumPath(root,0,targetSum)
        return self.flag

