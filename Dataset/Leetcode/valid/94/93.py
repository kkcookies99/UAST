 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        stack = []
        cur = root
        res = []
        while stack or cur:
            while cur:
                stack.append(cur)
                cur = cur.left
            node = stack.pop()
            res.append(node.val)
            cur = node.right
        return res

