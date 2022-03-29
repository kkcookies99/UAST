 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        pre_val = -float('inf')
        def gen(node):
            if node:
                yield from gen(node.left)
                yield node.val
                yield from gen(node.right)

        g = gen(root)
        for cur_val in g:
            if pre_val >= cur_val:
                return False
            pre_val = cur_val
        
        return True

