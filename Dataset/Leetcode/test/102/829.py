 class Solution:
    def XXX(self, root: TreeNode) -> [[int]]:
        if not root:
            return []
        # BFS广度
        # return self.bfs(root)
        # DFS深度
        self.rlt = []
        self.dfs(0, root)
        return self.rlt
    
    def bfs(self, root: TreeNode):
        # BFS广度优先搜索
        # 创建一个队列
        q = collections.deque()
        q.append(root)
        rlt = []

        while q:
            # 如果队列不为空，则创建一个列表用户存储当前层次数据
            level = []
            for i in range(len(q)):
                # 将当前层次所有节点进行遍历，并保存结果
                root = q.popleft()
                level.append(root.val)
                if root.left:
                    q.append(root.left)
                if root.right:
                    q.append(root.right)
            rlt.append(level)

        return rlt

    def dfs(self, level, root: TreeNode):

        if not root:
            return None

        if len(self.rlt) != level+1:
            self.rlt.append([])

        self.rlt[level].append(root.val)
        self.dfs(level+1, root.left)
        self.dfs(level+1, root.right)
        return None


