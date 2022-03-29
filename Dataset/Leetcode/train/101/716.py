 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def isImage(t1,t2):
            if t1 and t2:
                if t1.val != t2.val:
                    return False 
                leftImage = isImage(t1.left,t2.right)
                rightImage = isImage(t1.right,t2.left)
                return leftImage and rightImage
            return t1==t2==None
        
        return isImage(root.left, root.right) if root else True

