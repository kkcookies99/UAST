 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        stack = []
        cur = root
        last = float("-inf")
        while cur or stack:
            while cur:
                stack.append(cur)
                cur = cur.left
            cur = stack.pop()
            if cur.val > last: 
                last = cur.val
            else:
                return False
            cur = cur.right
        return True

