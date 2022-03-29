 class Solution:
    def __XXX__(self, leftTree: TreeNode, rightTree: TreeNode) -> bool:
        if leftTree == None and rightTree == None:
            return True
        elif leftTree == None or rightTree == None or leftTree.val != rightTree.val:
            return False
    
        return self.__XXX__(leftTree.left, rightTree.right) and self.__XXX__(leftTree.right, rightTree.left)
           
    def XXX(self, root: TreeNode) -> bool:
        if root == None:
            return True
        return self.__XXX__(root.left, root.right)

