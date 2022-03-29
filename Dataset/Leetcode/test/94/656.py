 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        stack = []
        res = []
        stack.append(root)

        while len(stack) > 0:
            cur = stack.pop()
            if isinstance(cur, TreeNode):
                stack.append(cur.right)
                stack.append(cur.val)
                stack.append(cur.left)
            elif isinstance(cur, int):
                res.append(cur)
        return res

