 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def fun(node,n=0):
            if not node:
                return n
            nl,nr=fun(node.left,n+1),fun(node.right,n+1)
            if abs(nl-nr)>1:
                raise StopIteration
            return max(nl,nr)
        try:
            fun(root)
        except StopIteration:
            return False
        else:
            return True

