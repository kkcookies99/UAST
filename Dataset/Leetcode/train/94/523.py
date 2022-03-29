 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        if not root:
            return []
        res = []
        stack = [root]
        node = root
        while stack:
            while node.left:
                stack.append(node.left)
                node = node.left
            node_ = stack.pop(-1)
            res.append(node_.val)
            if node_.right:
                stack.append(node_.right)
                node = node_.right
        return res

