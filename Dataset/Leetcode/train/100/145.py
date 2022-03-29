 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        def dfs(node1,node2):
            if not node1 and not node2:
                return
            if not node1 or not node2:
                ans[0] = False
                return
            if node1.val != node2.val:
                ans[0] = False

            dfs(node1.left,node2.left)
            dfs(node1.right,node2.right)
        ans = [True]
        dfs(p,q)
        return ans[0]

