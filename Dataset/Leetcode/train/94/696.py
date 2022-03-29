 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        res = []
        stack = [root] if root else []
        while stack:
            cur = stack.pop()
            if cur.right != None:
                stack.append(cur.right)
            if cur.left != None:
                left = cur.left
                cur.left = None
                cur.right = None
                stack.append(cur)
                stack.append(left)
            else:
                res.append(cur.val)
        return res

