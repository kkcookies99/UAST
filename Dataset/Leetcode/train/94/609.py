 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        ans, stack = [], []
        while stack or root:
            if root:
                stack.append(root)
                root = root.left
            else:
                root = stack.pop()
                ans.append(root.val)
                root = root.right
        return ans

