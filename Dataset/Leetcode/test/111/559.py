class Solution:
    def XXX(self, root: TreeNode) -> int:
        # BFS，遇左右节点均为空打印退出
        if not root:
            return 0
        res = []
        queque = [(1, root)]
        while queque:
            depth, first = queque.pop(0)
            if not first.left and not first.right:
                return depth
            if first.left:
                queque.append((depth+1, first.left))
            if first.right:
                queque.append((depth+1, first.right))

