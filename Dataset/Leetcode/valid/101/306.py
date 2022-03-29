 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if root == None:
            return False
        return self.isMirror(root.left, root.right)

    def isMirror(self, left: TreeNode, right: TreeNode) -> bool:
        if left == None and right == None:
            return True
        elif left == None or right == None:
            return False
        else:
            if left.val != right.val:
                return False
            else:
                return self.isMirror(left.left, right.right) and self.isMirror(left.right, right.left)

