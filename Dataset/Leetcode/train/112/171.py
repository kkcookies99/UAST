    def XXX(self, root: Optional[TreeNode], targetSum: int) -> bool:
        def DFS(root):
            path.append(root.val)
            if not root.right and not root.left: 
                if targetSum == sum(path):
                    res.append(True)
                else:
                    res.append(False)
            if root.left:#加进去的值还需要去掉
                DFS(root.left)
                path.pop()
            if root.right:
                DFS(root.right)
                path.pop()
        if root is None: return False        
        res = []
        path = []
        DFS(root)
        if True in res: 
            return True
        else:
            return False

