 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        ## 两个栈 一个从左往右，一个从右往左
        left = right = []
        le = ri = root
        while len(left)>0 or len(right)>0 or le is not None or ri is not None:
            while le is not None or ri is not None:
                if le is not None:
                    left.append(le)
                    le = le.left
                if ri is not None:
                    right.append(ri)
                    ri = ri.right
            if len(left)>0 or len(right)>0:
                ri = right.pop()
                le = left.pop()
                if ri.val !=le.val:
                    return False
                ri = ri.left 
                le = le.right
        return True

