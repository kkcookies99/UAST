 class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0

        min_height = 0
        from queue import Queue
        q = Queue()
        q.put((root, 1))

        while not q.empty():
            node, height = q.get()
            min_height = height
            if not node.left and not node.right:
                break
            if node.left:
                q.put((node.left, height+1))
            if node.right:
                q.put((node.right, height+1))

        return min_height

