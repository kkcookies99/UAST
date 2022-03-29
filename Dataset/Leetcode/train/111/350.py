class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        queue = [root]
        count = 1
        while(queue):
            n = len(queue)
            while(n>0):
                node = queue.pop(0)
                if not node.left and not node.right:
                    return count
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
                n = n - 1
            count = count + 1

