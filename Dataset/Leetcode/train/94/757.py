 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        if not root:
            return []
        stack = []
        res = []
        node = root
        while node or stack:
            if node:    # 不空加入栈，并向左走
                stack.append(node)
                node = node.left
            else:       # 向左走到投了，返回
                node = stack.pop()
                res.append(node.val)
                node = node.right
        return res```

