 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        p_list = self.levelOrder(p)
        q_list = self.levelOrder(q)
        if p_list == q_list:
            return True
        return False

    def levelOrder(self, root: TreeNode):
        if not root:
            return []

        queue = [root]
        res = []
        while queue:
            length = len(queue)  # 每层节点数
            sub_list = []  # 储存每一层结点值
            for i in range(length):
                node = queue.pop(0)  # 出队
                sub_list.append(node.val)  # 存储当前层节点val
                if node.left:  # 如果有左子树
                    queue.append(node.left)  # 左入队
                if node.right:
                    queue.append(node.right)  # 右入队
            res.append(sub_list)  # 把每层的结点值存储在res中
        return res

