 class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        queue = []
        res = []

        if root is None:
            return None
        
        parent = 1
        child = 0
        tmp = []

        queue.append(root)
        while len(queue) > 0:
            node = queue.pop(0)
            parent = parent - 1

            tmp.append(node.val)
            if node.left is not None:
                queue.append(node.left)
                child = child + 1
            if node.right is not None:
                queue.append(node.right)
                child = child + 1
            if parent == 0:
                res.append(tmp.copy())
                parent = child
                child = 0
                tmp = []
        return res

