 class Solution:
    def dfs(self, root, sum):
        sum = sum - root.val
        if root.left == None and root.right == None:
            if sum == 0:
                return True  
            else:
                return False
        elif root.right == None:
            return self.dfs(root.left, sum)
        elif root.left == None:
            return self.dfs(root.right, sum)
        else:
            return self.dfs(root.left, sum) or self.dfs(root.right, sum)

    def XXX(self, root: TreeNode, sum: int) -> bool:
        if root == None:
            return False
        return self.dfs(root, sum)

