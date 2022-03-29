class Solution:
    def XXX(self, root: TreeNode) -> int:
        stack = []
        length = 0
        if root:
            stack.append(root)
        while stack:
            size = len(stack)
            for _ in range(size):
                node = stack.pop(0)
                if node.left:
                    stack.append(node.left)
                if node.right:
                    stack.append(node.right)
            length += 1
        return length

