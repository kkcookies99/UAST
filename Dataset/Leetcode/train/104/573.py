class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        stack, deepth = [(root, 1)], 0
        while stack:
            node, deepth = stack.pop(0)
            if node.left:
                stack.append((node.left, deepth+1))
            if node.right:
                stack.append((node.right, deepth+1))
        return deepth

