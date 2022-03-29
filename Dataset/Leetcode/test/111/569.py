class Solution:
    def XXX(self, root: TreeNode) -> int:
        def mind(root):
            if root==None:return 9999999
            if root.left==None and root.right==None:return 1
            return 1+min(mind(root.left),mind(root.right))
        if root==None:return 0
        return mind(root)

