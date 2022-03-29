 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return true
        
        def compare(self, left, right):#这里的left和right不是左右子树，而是对称的左右两个数
            if left == None and right != None:
                return False
            if right == None and left != None:
                return False
            if left == None and right == None:#排除左右节点为空的情况
                return True
            
            if left.val != right.val:#排除非空左右节点数值不相等的情况
                return False
            
            #当左右节点非空且数值相等时做下一层递归，这里是重点
            outside = compare(self, left.left, right.right)
            inside = compare(self, left.right, right.left)
            res = outside and inside
            return res
        return compare(self, root.left, root.right)

