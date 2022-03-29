class Solution:
    def XXX(self, root: TreeNode):
        if not root: return 0
        left = self.XXX(root.left)
        right = self.XXX(root.right)
        if left ==0 and right==0:
            return min(left,right)+1
        elif (left == 0 and right!=0) or (left!=0 and right==0):
            return max(left,right)+1
        else:
            return min(left,right)+1

