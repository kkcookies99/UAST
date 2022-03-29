class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if root is None:
            return []
        result = []
        q = deque()
        q.append(root)
        while len(q) != 0:
            level = []
            for _ in range(len(q)):
                node = q.pop()
                level.append(node.val)
                if node.left is not None:
                    q.appendleft(node.left)
                if node.right is not None:
                    q.appendleft(node.right)
            result.append(level)
        return result

