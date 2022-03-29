 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        res = []
        stack = []
        cur = root
        while cur or stack:
            while cur:
                stack.append(cur)
                cur = cur.left
            cur = stack.pop()
            res.append(cur.val)
            cur = cur.right
        for i in range(len(res)-1):
            if res[i] >= res[i+1]:
                return False
        return True

