 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        res = []
        stack = []
        while root or stack:
            while root:
                stack.append(root)
                root = root.left  # 1. 左
            node = stack.pop()
            res.append(node.val)  # 2. 中
            root = node.right  # 3. 右
        return res

