class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        depth = 0
        cur = root
        queue = [root]
        while queue:
            queue = [sub_node for node in queue for sub_node in (node.left, node.right) if sub_node]
            depth += 1
        return depth

