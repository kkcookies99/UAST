class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def dfs(node):
            if node is None: return 0
            if (left_height := dfs(node.left)) == -1 or (right_height := dfs(node.right)
) == -1 or abs(left_height - right_height) > 1:
                return -1
            else:
                return max(left_height, right_height) + 1
        return dfs(root) != -1

