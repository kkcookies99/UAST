 class Solution(object):
    def isReverseTree(self, cur1, cur2):
        if not cur1 and cur2 or cur1 and not cur2:
            return False
        if not cur1 and not cur2:
            return True
        l1 = self.isReverseTree(cur1.left,cur2.right)
        l2 = self.isReverseTree(cur1.right,cur2.left)
        if cur1 and cur2:
            return cur1.val == cur2.val and l1 and l2


    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return True
        if root.left and not root.right or not root.left and root.right:
            return False
        if not root.left and not root.right:
            return True
        return self.isReverseTree(root.left, root.right)

