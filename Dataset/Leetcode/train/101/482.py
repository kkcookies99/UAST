 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        # 空二叉树，是镜像对称的
        if not root:
            return True
        # 只有第一层，是镜像对称的
        if not root.left and not root.right:
            return True
        # 分别遍历左右两半的树，并比较，相同即镜像对称
        if self.look_left_part(root.left) == self.look_right_part(root.right):
            return True
        else:
            return False

    # 遍历左半边，传入root.left
    def look_left_part(self,root_left:TreeNode) -> List:
        left_part = []
        if not root_left:
            left_part.append(None)
            return left_part
        else:
            left_part.append(root_left.val)
            left_part.append(self.look_left_part(root_left.left))
            left_part.append(self.look_left_part(root_left.right))
            return left_part

    # 遍历右半边，传入root.right，嵌套参数的传入顺序与遍历左半边的正好相反
    def look_right_part(self,root_right:TreeNode) -> List:
        right_part = []
        if not root_right:
            right_part.append(None)
            return right_part
        else:
            right_part.append(root_right.val)
            right_part.append(self.look_right_part(root_right.right))
            right_part.append(self.look_right_part(root_right.left))
            return right_part


