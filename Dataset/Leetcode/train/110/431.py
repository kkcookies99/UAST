class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def dfs(node, count):
            if not node: 
                return count
            count_left, count_right = dfs(node.left, count + 1), dfs(node.right, count + 1)
            return float('inf') if abs(count_right - count_left) > 1 else max(count_left, count_right)
        return False if dfs(root, 0) == float('inf') else True

