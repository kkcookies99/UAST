def XXX(self, root: TreeNode) -> int:
    if root is None:
        return 0
    
    left = self.XXX(root.left)
    right = self.XXX(root.right)
    if left == 0:
        return right + 1
    if right == 0:
        return left + 1
    return min(left, right) + 1

