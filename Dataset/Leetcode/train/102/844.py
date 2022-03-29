 class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        res = []
        queue = [root]
        while queue:
            next_queue = []
            item = []
            for node in queue:
                if node:
                    item.append(node.val)
                    next_queue.append(node.left)
                    next_queue.append(node.right)
            if item:
                res.append(item)
            queue = next_queue
        return res

