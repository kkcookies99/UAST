class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        """
        层序遍历
        :param root:
        :return: list[list]
        """
        if not root:
            return []
        res = []
        cur_nodes = [root]
        next_nodes = []
        res.append([i.val for i in cur_nodes])
        while cur_nodes or next_nodes:
            for node in cur_nodes:
                if node.left:
                    next_nodes.append(node.left)
                if node.right:
                    next_nodes.append(node.right)
                if next_nodes:
                    res.append([i.val for i in next_nodes])
            cur_nodes = next_nodes
            next_nodes = []
        return res

