class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if root is None:
            return []
        stack = [root]
        ans = [[root.val]]
        while stack:
            n = len(stack)
            tmp = []
            for j in range(n):
                cur = stack.pop(0)
                if cur.left is not None:
                    stack.append(cur.left)
                    tmp.append(cur.left.val)
                if cur.right is not None:
                    stack.append(cur.right)
                    tmp.append(cur.right.val)
            ans.append(tmp)
        ans.pop(-1)
        return ans

