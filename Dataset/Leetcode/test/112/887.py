 class Solution(object):
    def XXX(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        self.boolean = False
        def traceBack(root,target):
            if target==root.val and not root.left and not root.right:
                self.boolean = True
            if root.left:traceBack(root.left,target-root.val)
            if root.right:traceBack(root.right,target-root.val)                
        if root:traceBack(root,sum)
        return self.boolean

