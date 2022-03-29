class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def dfs(node):
            return 0 if node is None else -1 if (left_height := dfs(node.left)) == -1 or (right_height := dfs(node.right)) == -1 or abs(left_height - right_height) > 1 else max(left_height, right_height) + 1
        return dfs(root) != -1

