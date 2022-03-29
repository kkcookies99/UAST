class Solution:
    def XXX(self, root: TreeNode) -> int:
        # 方法一：
        # if root == None :
        #     return 0
        # # 计算左右子树的最小深度
        # left_min_depth = self.XXX(root.left) 
        # right_min_depth = self.XXX(root.right) 
        # # 如果左子树深度为0，则返回右子树深度+1
        # if left_min_depth ==0 :
        #     return right_min_depth + 1
        # # 如果右子树深度为0，则返回左子树深度+1
        # if right_min_depth == 0:
        #     return left_min_depth + 1
        # # 如果两个深度都部位0 ，且左子树深度小于等于右子树深度，则返回左子树深度+1，否则返回右子树深度+1
        # if left_min_depth <= right_min_depth:
        #     return left_min_depth + 1
        # else:
        #     return right_min_depth + 1

        # 方法二：
        if root ==None:
            return 0
        # 计算左右子树的最小深度
        left_min_depth = self.XXX(root.left) 
        right_min_depth = self.XXX(root.right) 
        if root.left and root.right:
            return  1 + min(left_min_depth,right_min_depth)
        else:
            return 1 + left_min_depth + right_min_depth

