class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if root == None:
            return True
        return self.process(root).balanced


    def process(self, root):
        if root == None:
            return Info(True, 0)
        left = self.process(root.left)
        right = self.process(root.right)
        height = 1 + max(left.height, right.height)
        balanced = left.balanced and right.balanced and abs(left.height - right.height) <= 1
        return Info(balanced, height)

