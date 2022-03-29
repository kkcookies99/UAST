class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        ress = []
        stack = []
        if root:
            stack.append(root)
        while stack:
            res = []
            size = len(stack)
            for _ in range(size):
                node = stack.pop(0)
                res.append(node.val)
                if node.left:
                    stack.append(node.left)
                if node.right:
                    stack.append(node.right)

            ress.append(res)
        return ress

