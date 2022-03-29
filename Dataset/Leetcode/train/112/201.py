 class Solution:
    def XXX(self, root: Optional[TreeNode], targetSum: int) -> bool:
        # 深搜 回溯 找到即返回True
        def backtracking(root: Optional[TreeNode], path_sum: int) -> bool:            
            if not root.left and not root.right:  # 叶子节点
                if path_sum == targetSum:
                    return True 
                return False

            if root.left:
                path_sum += root.left.val
                if backtracking(root.left, path_sum):
                    return True
                path_sum -= root.left.val
            if root.right:
                path_sum += root.right.val
                if backtracking(root.right, path_sum):
                    return True
                path_sum -= root.right.val
            
            return False

        if not root:
            return False
        return backtracking(root, root.val)

