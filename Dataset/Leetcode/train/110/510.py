class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def height(root):
            if not root:
                return 0;
            return max(height(root.left),height(root.right))+1     
        if not root:
            return True;
        return abs(height(root.left)-height(root.right))<=1 and self.XXX(root.left) and self.XXX(root.right)

