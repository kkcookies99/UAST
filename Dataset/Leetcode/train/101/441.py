 class Solution:
    def func(self, left, right):
        if left == None and right == None:
            return True
        if left == None or right == None:
            return False
        if left.val == right.val:
            return self.func(left.right, right.left) and self.func(left.left, right.right)
        else:
            return False

    def XXX(self, root: TreeNode) -> bool:
        if root == None:
            return True
        return self.func(root.left, root.right)

