 class Solution:
    def XXX(self, root: TreeNode, sum: int) -> bool:
        def x(root):
            r=[]
            if not root:return []
            if  not root.left and not root.right:return [root.val]
            for i in x(root.left):r.append(root.val+i)
            for j in x(root.right):r.append(root.val+j)
            return r
        a=x(root)
        return sum in a

