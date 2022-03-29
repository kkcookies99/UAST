 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        queue = [root]
        res = []
        while queue:
            next_queue = []
            layer = []
            for node in queue:
                if node:
                    layer.append(node.val)
                    next_queue += [node.left, node.right]
            queue = next_queue[:]
            if layer:
                res.append(layer[:])
        return res

