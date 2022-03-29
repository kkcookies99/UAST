 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]

        核心思想：
                中序遍历原理：先遍历左子树，在访问根节点，最后遍历右子树
        """
        self.res = []
        def middle_order(node):
            if node != None:
                middle_order(node.left)
                self.res.append(node.val)
                middle_order(node.right)
        
        middle_order(root)
        return self.res

