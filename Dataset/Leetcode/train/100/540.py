 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        def dfs(p, q):
            if p is not None and q is not None:
                if p.val == q.val:
                    if dfs(p.left, q.left) is False:
                        return False
                    if dfs(p.right, q.right) is False:
                        return False
                    return True
                else:
                    return False
            elif p is None and q is not None:
                return False
            elif p is not None and q is None:
                return False
            else:
                return True
        return dfs(p, q)

