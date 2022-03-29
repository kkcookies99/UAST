class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        queue = [root]
        layer = 0
        while queue:
            layer += 1
            l = len(queue)
            for i in range(l):
                node = queue.pop(0)
                if not node.left and not node.right:
                    return layer
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)

