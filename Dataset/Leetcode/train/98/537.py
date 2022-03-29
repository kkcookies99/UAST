 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return False
        temp = float('-inf')
        res = []
        cur = root
        while res or cur:
            while cur:
                res.append(cur)
                cur = cur.left
            pop = res.pop()
            if pop.val <= temp:
                return False
            else:
                temp = pop.val
            if pop.right:
                cur = pop.right
        return True

