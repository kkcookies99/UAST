class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def dfs(node):
            if node is None:
                return 0
            left_hight = dfs(node.left)
            right_hight = dfs(node.right)
            if left_hight < 0 or right_hight < 0 or abs(left_hight-right_hight) > 1:
                return -1
            return max(left_hight, right_hight) + 1
        return dfs(root) >= 0

