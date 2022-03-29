 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        queue = deque([root])
        while queue:
            cur = queue
            queue = deque()
            tmp = []
            while cur:
                node = cur.popleft()
                if node:
                    tmp.append(node.val)
                    queue.append(node.left)
                    queue.append(node.right)
                else:
                    tmp.append(None)
            for i in range(len(tmp) // 2):
                if tmp[i] != tmp[- i - 1]:
                    return False
        return True

