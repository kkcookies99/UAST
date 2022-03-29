 class Solution:
    def XXX(self,root):
        pre = -0xfffffffffffffff
        def visit(root):
            nonlocal pre
            if not root:
                return True
            if visit(root.left):
                if pre < root.val:
                    pre = root.val
                    return visit(root.right)
            return False
        return visit(root)

