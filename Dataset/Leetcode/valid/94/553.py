 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        # 左 根 右
        stack, res = [],  []
        curr = root
        while stack or curr:
            if curr:
                stack.append(curr)
                curr = curr.left
            else:
                curr = stack.pop()
                res.append(curr.val)
                curr = curr.right
        return res

