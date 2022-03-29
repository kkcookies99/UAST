 class Solution(object):
    '''
    思路：递归，值为boolean，判断是否符合条件，
    叶子节点
    '''
    isRecursion=False
    def XXX(self, root, sum):
        if not root:
            return False
        if not (root.left and root.right) and sum==root.val:
            if Solution.isRecursion:
                return True
            else:
                return False
        else:
            Solution.isRecursion=True
            return bool(self.XXX(root.left,sum-root.val)+self.XXX(root.right,sum-root.val))

