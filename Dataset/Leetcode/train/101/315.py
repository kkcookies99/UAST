 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if root == None:
            return True
        else:
            return self.compare(root.left, root.right)
        
    def compare(self, left, right):
        # 排除有空的情况
        if left == None and right != None:
            return False
        elif left != None and right == None:
            return False
        elif left == None and right == None:
            return True
        # 都不为空时，两个节点数值不相同
        elif left.val != right.val:
            return False
        # 两个节点数值相同的情况
        outside = self.compare(left.left, right.right)
        inside = self.compare(left.right, right.left)
        isSame = outside and inside
        
        return isSame

