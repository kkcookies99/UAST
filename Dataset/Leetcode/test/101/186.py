 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return True
        def travel(left, right):
            if not (left or right): 
                return True
            if not (left and right):#左右只要有一个为None就返回False
                return False
            if left.val != right.val:
                return False
            return travel(left.left, right.right) and travel(left.right, right.left)
   return travel(root.left, root.right)

