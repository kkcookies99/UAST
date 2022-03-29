class Solution:
    def XXX(self, root: TreeNode) -> int:
        """广度优先搜索(BFS)"""
        depth, nodes = 0, []
        if root:
            nodes.append(root)
        while nodes:
            depth += 1
            current = []
            for node in nodes:
                if node.left:
                    current.append(node.left)
                if node.right:
                    current.append(node.right)
            nodes = current
        return depth

