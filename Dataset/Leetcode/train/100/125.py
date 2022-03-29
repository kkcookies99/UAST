 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:  
        # 如果p和q都是None
        if p == q:
            return True
        # 如果p和q都不为None
        if p and q:
            # 判断当前val是不是相等
            if p.val != q.val:
                return False
            # 递归判断左右子树是不是相等，只要有一个不相等就返回False
            elif not self.XXX(p.left,q.left) or not self.XXX(p.right,q.right):
                return False
            # 只有递归全为True才会返回True
            else:
                return True
        else:
            return False

