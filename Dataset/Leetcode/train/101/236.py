 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        """
        递归实现
        每次比较左子节点的左节点和右子节点的右节点，比较左子节点的右节点和右子节点的左节点
        """
        if root is None:
            return True
        
        ans = self.dfs(root.left, root.right)

        return ans
    
    def dfs(self, left, right):
        # 有子节点为None
        if left is None and right is None:
            return True
        elif left is None and right is not None:
            return False
        elif left is not None and right is None:
            return False
        # 子节点不为None
        elif left.val != right.val:
            return False
        
        outside = self.dfs(left.left, right.right)
        inside = self.dfs(left.right, right.left)
        is_same = outside and inside

        return is_same
        

