 class Solution:
    def __init__(self):
        self.max_val = float('-inf')

    def XXX(self, root: TreeNode) -> bool:
       # 每次只检查当前值是不是比上个节点的值大
        if not root:
            return True
        # 中序
        left = self.XXX(root.left)
        if self.max_val < root.val:
            self.max_val = root.val
        else:
            return False
        right = self.XXX(root.right)

        return left and right

