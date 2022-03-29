 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if root == None :
            print('000')
            return True
        else:
            if root.left == root.right == None:
                return True
            elif root.left and root.right:
                if root.left.val < root.val and root.right.val > root.val:
                    return self.XXX(root.left) and self.XXX(root.right)
                else:
                    return False
            elif root.left:
                if root.left.val < root.val:
                    return self.XXX(root.left)
            elif root.right:
                if root.right.val > root.val:
                    return self.XXX(root.right)
                
            

