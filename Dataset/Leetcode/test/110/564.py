class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return True
        def cacudeep(node):
            if not node:
                return 0
            return max(cacudeep(node.left),cacudeep(node.right))+1
        return True if abs(cacudeep(root.left)-cacudeep(root.right))<=1 and self.XXX(root.left) and self.XXX(root.right) else False


