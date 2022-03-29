class Solution:
    def XXX(self, root: TreeNode) -> int:
        depth = 0
        if root is None:
            return depth
        
        s = collections.deque([root])

        # root本身是一层
        depth += 1    

        while len(s) > 0:
            size = len(s)
            for _ in range(size):
                node = s.popleft()
                # 到达叶子节点
                if node.left is None and node.right is None:
                    return depth
                if node.left is not None:
                    s.append(node.left)
                if node.right is not None:
                    s.append(node.right)
            depth += 1
        return depth

