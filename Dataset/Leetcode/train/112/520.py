 class Solution(object):
    def XXX(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        if root is None:
            return False
        res = []
        def func(cur_node, s):
            if cur_node.left is None and cur_node.right is None:
                if cur_node.val == s:
                    res.append(0)
            if cur_node.left is not None:
                func(cur_node.left, s - cur_node.val)
            if cur_node.right is not None:
                func(cur_node.right, s - cur_node.val)
        func(root, sum)
        return True if len(res)>0 else False

