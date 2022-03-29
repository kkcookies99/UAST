 class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        queue = [root]
        depth = 1
        cn = 1
        while queue:
            cnn = 0
            for i in range(cn):
                node = queue.pop(0)
                if not node.left and not node.right:
                    return depth
                if node.left:
                    queue.append(node.left)
                    cnn += 1
                if node.right:
                    queue.append(node.right)
                    cnn += 1
            cn = cnn
            depth += 1

