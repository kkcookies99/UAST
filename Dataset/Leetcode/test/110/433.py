class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return True

        # 第一步：求节点的高度函数    
        def dfs(root):
            if not root:
                return 0
            L = dfs(root.left)
            R = dfs(root.right)
            return max(L,R)+1
        
        #第二步：判断根节点的左右子树高度，如果大于11，返回Fals
        if abs(dfs(root.left)-dfs(root.right))>1:
            return False

        #第三步：递归左子树，右子树
        return self.XXX(root.left) and self.XXX(root.right)
        


