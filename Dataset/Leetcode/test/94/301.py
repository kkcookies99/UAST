 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        def dfs(node):
            node and (yield from chain(dfs(node.left), [node.val], dfs(node.right)))
        return [*dfs(root)]

