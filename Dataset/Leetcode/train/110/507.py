class Solution:
    def getHeight(self,node:TreeNode)->int:
        if node == None:
            return 0
        else:
            left_num = self.getHeight(node.left)
            right_num = self.getHeight(node.right)
            return (left_num + 1) if left_num > right_num else (right_num + 1)

    def XXX(self, root: TreeNode) -> bool:
        if root == None:
            return True
        left_num = self.getHeight(root.left)
        right_num = self.getHeight(root.right)
        if (left_num+1) >= right_num and (right_num + 1) >= left_num:
            return self.XXX(root.left) and self.XXX(root.right)
        return False

