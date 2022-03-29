class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root is None:
            return 0
        stack = [[root, 1]]
        cur = root
        while cur or stack:
            cur = stack.pop(0)
            if not cur[0].left and not cur[0].right:
                return cur[1]
            if cur[0].left:
                stack.append([cur[0].left, cur[1]+1])
            if cur[0].right:
                stack.append([cur[0].right, cur[1]+1])

