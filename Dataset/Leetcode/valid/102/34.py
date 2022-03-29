class Solution:
    def XXX(self, root: TreeNode):
        from collections import deque
        queue = deque()
        result = []
        if not root:
            return []
        queue.append(root)
        while queue:
            current_level_size = len(queue)
            current_level = []
            for _ in range(current_level_size):
                node = queue.popleft()
                current_level.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            result.append(current_level)
        return result

