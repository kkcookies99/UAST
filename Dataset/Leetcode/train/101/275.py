 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if root is None:
            return True
        return self._XXX(root.left, root.right)

    def _XXX(self, A, B):
        if A is None and B is None:
            return True
        if A is not None and B is not None:
            return self._XXX(A.left, B.right) and self._XXX(A.right, B.left) and A.val == B.val
        return False

