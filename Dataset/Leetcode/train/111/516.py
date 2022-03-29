class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root: return 0
        queue, depth = [root], 1
        while queue:
            level_size = len(queue)
            while level_size:
                cur = queue[0]
                if not cur.left and not cur.right:
                    return depth
                if cur.left:
                    queue.append(cur.left)
                if cur.right:
                    queue.append(cur.right)
                del queue[0]
                level_size -= 1
            depth += 1
        return depth

