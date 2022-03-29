 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        #获取子树最大深度
        def fun(root):
            if not root:
                return 0
            else:
                left=1+fun(root.left)
                right=1+fun(root.right)
            return max(left,right)
        if not root:
            return True
        l = fun(root.left)
        r = fun(root.right)
        if abs(l-r)>1:
            return False
        else:
            return self.XXX(root.left) and self.XXX(root.right)

