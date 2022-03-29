class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        # BFS
        # if not root:
        #     return []

        # cur_lay = [root]
        # result = []
        # while cur_lay:
        #     # 一层
        #     next_lay = []  # 存储下一层迭代信息 额外的空间开销
        #     cur_node = []  # 存储当前层节点
        #     for node in cur_lay:
        #         # 一个节点
        #         cur_node.append(node.val)
        #         if node.left:
        #             next_lay.append(node.left)
        #         if node.right:
        #             next_lay.append(node.right)
        #     result.append(cur_node)
        #     cur_lay = next_lay
        # return result

        if not root:
            return []
        
        queue = deque([root])
        result = []
        while queue:
            lay = []
            for _ in range(len(queue)):
                node = queue.popleft()
                lay.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)                
            result.append(lay)
        return result

