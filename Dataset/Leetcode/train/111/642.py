 class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root: return 0
        depth = 1
        queue = [root]
        while queue:
            next_queue = []
            for node in queue:
                if not node.left and not node.right:
                    return depth
                else:
                    next_queue += [sub_node for sub_node in [node.left, node.right] if sub_node]
            depth += 1
            queue = next_queue
        return depth

