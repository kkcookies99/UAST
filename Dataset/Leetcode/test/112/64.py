class Solution:
    def XXX(self, root: TreeNode, sum: int) -> bool:
        if root == None:
            return False
        if root.left == None and root.right == None:
            return sum - root.val == 0
        if self.XXX(root.left, sum - root.val) or self.XXX(root.right, sum - root.val):
            return True

