 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return True

        mid = root.val
        return self._left_dfs(root.left, mid) and self._right_dfs(root.right, mid) \
            and self.XXX(root.left) and self.XXX(root.right)

    def _left_dfs(self, node, mid):
        if not node:
            return True
        return node.val < mid and self._left_dfs(node.left, mid) and self._left_dfs(node.right, mid)

    def _right_dfs(self, node, mid):
        if not node:
            return True
        return node.val > mid and self._right_dfs(node.left, mid) and self._right_dfs(node.right, mid)

