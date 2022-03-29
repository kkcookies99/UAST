 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if root:
            queue = deque([root.left, root.right])
            while queue:
                node_left, node_right = queue.popleft(), queue.pop()
                if (not node_left) ^ (not node_right) or node_left and node_right and node_left.val != node_right.val:
                    return False                
                if node_left:
                    queue.extendleft([node_left.right, node_left.left])
                if node_right:
                    queue.extend([node_right.left, node_right.right])
        return True

