 class Solution:
    def XXX(self, root: TreeNode, targetSum: int) -> bool:
        if not root:
            return False
        
        def helper(root, acc, targetSum):
            
            if not root.left and not root.right:
                if acc + root.val == targetSum:
                    return True

            #print(root.val, acc)
            if root.left and helper(root.left, acc+root.val, targetSum):
                return True 
                
            if root.right and helper(root.right, acc+root.val, targetSum):
                return True

            return False      


        return helper(root, 0, targetSum)  

