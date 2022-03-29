 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        
        def isSame(TA: TreeNode, TB: TreeNode) -> bool:
            if TA is None and TB is None:
                return True
            if TA is None or TB is not None:
                return False
            if TA.val != TB.val:
                return False
            return isSame(TA.left , TB.right) and isSame(TA.right, TB.left)
        return isSame(root, root)

