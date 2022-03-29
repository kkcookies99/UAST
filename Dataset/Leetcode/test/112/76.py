class Solution(object):
    def XXX(self, root, targetSum):
        """
        :type root: TreeNode
        :type targetSum: int
        :rtype: bool
        """
        #递归
        if not root:
            return False
        elif not root.left and not root.right: #root是否为叶子节点
            return root.val == targetSum
        return self.XXX(root.left,targetSum-root.val) or self.XXX(root.right,targetSum-root.val)

