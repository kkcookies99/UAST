 class Solution:
    def XXX(self, root: TreeNode, targetSum: int) -> bool:
        if not root:
            return False
        return self.dfs(root, 0, targetSum)

    def dfs(self, root, total, targetSum):
        result_left, result_right = False, False
        if not root.left and not root.right:
            # 叶子结点

            return True if root.val + total == targetSum else False
        if root.left:
            result_left = self.dfs(root.left, total + root.val, targetSum)
            if result_left:
                # 如果满足，立即返回
                return result_left
        if root.right:
            result_right = self.dfs(root.right, total + root.val, targetSum)
            if result_right:
                return result_right
        # 左右子树不满足，回溯继续遍历
        return False

