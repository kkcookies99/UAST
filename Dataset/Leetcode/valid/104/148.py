class Solution:
    def XXX(self, root: TreeNode) -> int:
        def get_depth(p):
            if p:
                return max(get_depth(p.left),get_depth(p.right))+1
            else:
                return 0
        return get_depth(root)

