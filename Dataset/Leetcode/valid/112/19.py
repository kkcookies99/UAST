class Solution:
    def XXX(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if root == None:
            return False
        self.res, path = False, []
        self.process(root, path, targetSum)
        return self.res


    def process(self, root, path, targetSum):
        if root == None:
            return
        targetSum -= root.val
        path.append(root.val)
        if root.left == None and root.right == None and targetSum == 0:
            self.res = True
            return
        if root.left:
            self.process(root.left, path, targetSum)
            path.pop()
        if root.right:
            self.process(root.right, path, targetSum)
            path.pop()

