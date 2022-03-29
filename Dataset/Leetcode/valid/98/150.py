 class Solution:
    def dfs(self, node: TreeNode, ans: List[int]):
        if not node:
            return

        self.dfs(node.left, ans)
        ans.append(node.val)
        self.dfs(node.right, ans)

    def XXX(self, root: TreeNode) -> bool:
        ans = []
        self.dfs(root, ans)
        if len(ans) <= 1:
            return True

        for i in range(1, len(ans)):
            if ans[i] <= ans[i - 1]:
                return False

        return True

