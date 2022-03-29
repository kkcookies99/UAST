class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        queue = deque([root])
        res = []
        while queue:
            res.append([])
            for _ in range(len(queue)):
                node = queue.popleft()
                res[-1].append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
        return res

