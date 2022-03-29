class Solution:
    # 注意深度和高度的区别
    def XXX(self, root: TreeNode) -> bool:
        if self.get_height(root) == -1:
            return False
        return True 

    def get_height(self, root):
        if not root:
            return 0
        left_height = self.get_height(root.left)
        if left_height == -1:
            return -1
        right_height = self.get_height(root.right)
        if right_height == -1:
            return -1
        if abs(left_height - right_height) > 1:
            return -1
        else:
            return 1 + max(left_height, right_height)

