 class Solution:
    def dfs(self, root, result, target):
        if(root is None):
            return result == target
        if(root.left is None and root.right is None):
            return result + root.val == target
        else:
            if(root.left is None):
                return self.dfs(root.right, result + root.val, target)
            elif(root.right is None):
                return self.dfs(root.left, result + root.val, target)
            else:
                return self.dfs(root.right, result + root.val, target) or self.dfs(root.left, result + root.val, target)
    def XXX(self, root: TreeNode, targetSum: int) -> bool:
        if(root is None):
            return False
        return self.dfs(root, 0, targetSum)

