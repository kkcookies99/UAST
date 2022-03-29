 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        # 左 根 右
        self.res = []
        
        def inorder(root):
            if not root:
                return 
            inorder(root.left)
            self.res.append(root.val)
            inorder(root.right)
            return self.res
        
        if not root: return []
        return inorder(root)

