 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        def dfs(tree):
            if tree:
                yield tree.val
                if not tree.left and tree.right:
                    yield 'null'
                yield from dfs(tree.left)
                yield from dfs(tree.right)

        p_list = list(dfs(p))
        q_list = list(dfs(q))
        return p_list == q_list

