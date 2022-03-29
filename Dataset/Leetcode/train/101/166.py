 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if root == None:
            return True
        return self.isEqual(root.left, root.right)


    def isEqual(self, left, right):
        if left == None and right != None:
            return False
        if left != None and right == None:
            return False
        if left == None and right == None:
            return True
        return left.val == right.val and self.isEqual(left.left, right.right) and self.isEqual(left.right, right.left)

