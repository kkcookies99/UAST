class Solution(object):
    def XXX(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        if not root :
            return False
        return self.value(root,0,sum)
    def value(self,tree,val,target):
        if not tree :
            return False
        val=val+tree.val
        if val==target and not tree.left and not tree.right:
            return True
        if self.value(tree.left,val,target)  or self.value(tree.right,val,target):
            return True
        else:
            return False

