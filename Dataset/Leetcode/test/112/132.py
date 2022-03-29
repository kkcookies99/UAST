class Solution:
    def XXX(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if root is None: return False
        curSum = 0
        self.flag = False

        def dfs(root, curSum):
            if root is not None:
                curSum += root.val
                if root.left is None and root.right is None:
                    print(curSum)
                    if curSum == targetSum:
                        self.flag =  True
                    else:
                        return 
                else:
                    dfs(root.left, curSum)
                    dfs(root.right, curSum)             

        dfs(root, curSum)
        return self.flag

