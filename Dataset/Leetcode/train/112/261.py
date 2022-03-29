 class Solution:
    def XXX(self, root: TreeNode, targetSum: int) -> bool:
        num = 0
        ans = self.dfs(num, root, targetSum)
        
        return ans

    
    def dfs(self, num, node, target):
        if not node:
            return False

        num += node.val
        if node.left is None and node.right is None:  # 叶子节点
            if num == target:
                return True
            else:
                return False
        else:
            return self.dfs(num, node.left, target) or \
                   self.dfs(num, node.right, target)

