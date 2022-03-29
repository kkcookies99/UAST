 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return True
        
        # 中序遍历是递增的
        stack = [root]
        inorder = float('-inf')

        while stack:
            node = stack.pop()
            if isinstance(node, TreeNode):
                stack.extend([node.right, node.val, node.left])
            elif isinstance(node, int):
                # whether the ininorder is strictly ascending
                if node <= inorder:
                    return False
                inorder = node
        return True

