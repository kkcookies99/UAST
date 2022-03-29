class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        return self.dfs(root,0)
    
    def dfs(self, root, level):
        if not root:
            return level
        
        if not root.left and not root.right:
            return level + 1
        
        max_left = 0
        max_right= 0
        
        if root.left:
            max_left = self.dfs(root.left, level+1)
        
        if root.right:
            max_right=self.dfs(root.right, level+1)

        return max(max_left,max_right)

