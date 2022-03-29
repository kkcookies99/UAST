class Solution:
    def __init__(self):
        self.ans = 0

    def XXX(self, root: TreeNode) -> int:
        self.topDown(root, 1)
        return self.ans
        
    def bottomUp(self, root):
        if not root:
            return 0
        return max(self.bottomUp(root.left), self.bottomUp(root.right)) + 1

    def topDown(self, root, depth):
        if not root:
            return 0
        if not root.left and not root.right:
            self.ans = max(self.ans, depth)
        self.topDown(root.left, depth + 1)
        self.topDown(root.right, depth + 1)

