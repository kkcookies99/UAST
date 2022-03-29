 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        preleft = lambda node: ([node.val] + preleft(node.left) + preleft(node.right)) if node else [None]
        preright = lambda node: ([node.val] + preright(node.right) + preright(node.left)) if node else [None]
        return preleft(root) == preright(root)

