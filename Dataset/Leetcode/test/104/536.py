class Solution:
    def XXX(self, root: TreeNode) -> int:
        res = 0
        if not root:
            return res
        from queue import Queue
        q = Queue()
        q.put((root, 1))
        while not q.empty():
            node, height = q.get()
            res = height
            if node.left:
                q.put((node.left, height+1))
            if node.right:
                q.put((node.right, height+1))

        return res

