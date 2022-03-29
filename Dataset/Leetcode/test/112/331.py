 class Solution:
    def XXX(self, root: TreeNode, targetSum: int) -> bool:
        if not root:
            return False
        queue = [root]
        while queue:
            l = len(queue)
            for i in range(l):
                node = queue.pop(0)
                if not node.left and not node.right and node.val == targetSum:
                    return True
                if node.left:
                    node.left.val += node.val
                    queue.append(node.left)
                if node.right:
                    node.right.val += node.val
                    queue.append(node.right)
        return False

