class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        def dfs(root, level):
            if not root: return
            if not ans: ans.append([])
            elif level > len(ans) - 1:
                ans.append([])
            ans[level].append(root.val)
            dfs(root.left, level + 1)
            dfs(root.right, level + 1)
        ans = []
        dfs(root, 0)
        return ans

