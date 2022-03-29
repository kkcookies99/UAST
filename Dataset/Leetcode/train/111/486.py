class Solution:
    def XXX(self, root: TreeNode) -> int:
        def recursion(root: TreeNode) -> int:
            if root:
                if root.left==None and root.right!=None:
                    return recursion(root.right)+1
                elif root.left!=None and root.right==None:
                    return recursion(root.left)+1
                return min(recursion(root.left),recursion(root.right))+1
            else: return 0
        return recursion(root)

