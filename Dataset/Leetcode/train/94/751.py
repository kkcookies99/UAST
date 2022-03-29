 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        if root is None:
            return []
        stack = [root]
        ans = []
        while stack != []:
            while stack[-1].left is not None:
                stack.append(stack[-1].left)
            while stack != []:
                BT = stack.pop()
                ans.append(BT.val)
                if BT.right is not None:
                    stack.append(BT.right)
                    break
        return ans


