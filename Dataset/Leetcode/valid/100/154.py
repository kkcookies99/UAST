 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        return self.compare(p,q)
    def compare(self, left: TreeNode, right: TreeNode) -> bool:
        # 有空值的时候
        if left == None and right:
            return False
        elif left and right == None:
            return False
        elif left == None and right == None:
            return True
        # 左右节点都有值的时候
        elif left.val != right.val:
            return False

        outside = self.compare(left.left, right.left)
        inside = self.compare(left.right, right.right)
        return outside and inside

