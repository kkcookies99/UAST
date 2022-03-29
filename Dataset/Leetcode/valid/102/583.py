class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if root is None : return []
        queue = [root]
        res = []
        # visited = set()
        while queue:
            cur_len = len(queue)
            cur_res = []
            for _ in range(cur_len):
                cur_node = queue.pop(0)
                cur_res.append(cur_node.val)
                if cur_node.left:
                    queue.append(cur_node.left)
                if cur_node.right:
                    queue.append(cur_node.right)
            res.append(cur_res)
        return res

# dfs
# class Solution:
#     def XXX(self, root: TreeNode) -> List[List[int]]:
#         if root is None : return []
#         self.result = []
#         def _dfs(node, level):
#             if not node: return 
#             if len(self.result) == level: self.result.append([]) # 当前level比最大下标多1
#             self.result[level].append(node.val)
#             _dfs(node.left, level + 1)
#             _dfs(node.right, level + 1)
#         _dfs(root, 0)
#         return self.result

