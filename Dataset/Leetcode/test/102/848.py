 class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        from collections import deque
        if not root:
            return []
        res = []
        node_queue = deque()
        node_queue.append(root)
        while node_queue:
            layer_list = []
            size = len(node_queue)
            while size:
                node = node_queue.popleft()
                layer_list.append(node.val)
                if node.left:
                    node_queue.append(node.left)
                if node.right:
                    node_queue.append(node.right)
                size -= 1
            res.append(layer_list)
        return res

