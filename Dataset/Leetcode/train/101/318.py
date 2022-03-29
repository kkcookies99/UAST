 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        queue = collections.deque()
        queue.append(root.left)
        queue.append(root.right)
        while queue:
            root_right = queue.popleft()
            root_left = queue.popleft()
            if (not root_left) ^ (not root_right): return False
            if not root_left and not root_right: continue
            if root_left.val != root_right.val: return False
            queue.append(root_left.left)
            queue.append(root_right.right)
            queue.append(root_left.right)
            queue.append(root_right.left)
        return True

