class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root == None:
            return 0
        def sub(root):
            if root == None:
                return float("inf")
            if root != None and root.left == None and root.right == None:
                return 1
            return min(sub(root.left), sub(root.right)) + 1
        return sub(root)

