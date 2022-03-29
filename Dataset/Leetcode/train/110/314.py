class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def checkBalanced(node):
            if node==None: return 0
            left=checkBalanced(node.left)
            right=checkBalanced(node.right)
            if left==-1 or right==-1 or abs(left-right)>=2: return -1
            return max(left,right)+1
        return checkBalanced(root)!=-1

