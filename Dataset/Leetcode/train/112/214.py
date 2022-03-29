 class Solution:
    def XXX(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if not root:
            return False

        res = False

        def dfs(node, pre):
            nonlocal res
            if not node:
                return

            node.val += pre
            pre = node.val
            
            if node.left == node.right == None and pre == targetSum:
                res = True
                return

            dfs(node.left, pre)
            dfs(node.right, pre)

        dfs(root, 0)

        return res

