def XXX(self, root: Optional[TreeNode], targetSum: int) -> bool:
    # base case
    if root is None:
        return False

    if root.left or root.right:   # 非叶子节点
        return self.XXX(root.left, targetSum - root.val) or self.XXX(root.right, targetSum - root.val)
    else:                         # 叶子节点
        return targetSum == root.val

