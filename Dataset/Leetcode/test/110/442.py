class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def dfs(node):
            if not node:
                return 0
            return max(dfs(node.left), dfs(node.right)) + 1
        if not root:
            return True
        if not (root.left or root.right):
            return True
        queue = [root]
        if not (root.left and root.right):
            if root.left:
                return dfs(root.left)<=1
            if root.right:
                return dfs(root.right)<=1
        while queue:
            node = queue.pop()
            if abs(dfs(node.left) - dfs(node.right)) > 1:
                return False
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
        return True

