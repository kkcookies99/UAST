class Solution:
    def XXX(self, root: TreeNode) -> int:
        # 双向队列法
        if not root:
            return 0
        level = deque([root])
        depth = 0
        while level:
            for _ in range(len(level)):
                node = level.popleft()
                if node.left:
                    level.append(node.left)
                if node.right:
                    level.append(node.right)
            depth += 1
        return depth
        
        """ 递归法一行代码
        return 1 + max(self.XXX(root.left), self.XXX(root.right)) if root else 0
        """

