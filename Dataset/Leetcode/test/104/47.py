class Solution:
    def XXX(self, root: TreeNode) -> int:
        if root is None:
            return 0
        cur_layer = [root]
        next_layer = []
        depth = 0
        while cur_layer:
            depth += 1
            for node in cur_layer:
                if node.left:
                    next_layer.append(node.left)
                if node.right:
                    next_layer.append(node.right)
            cur_layer = next_layer
            next_layer = []
        return depth

