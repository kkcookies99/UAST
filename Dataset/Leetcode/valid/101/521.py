 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        return self.ismirror(root,root)

    def ismirror(self,l:TreeNode,r:TreeNode) -> bool:
        if not l and not r:
            return True
        if not l or not r:
            return False
        if l.val != r.val:
            return False
        return self.ismirror(l.left,r.right) and self.ismirror(l.right,r.left)

