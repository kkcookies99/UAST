 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        stack =[root]
        res = []
        while stack:
            while root:
                root = root.left
                if root:
                    stack.append(root)
            root = stack.pop()
            if root:
                res.append(root.val)
                root = root.right
                stack.append(root)
        left = float("-inf")
        for i in res:
            if i<=left:
                return False
            left = i
        return True

