class Solution:
    def __init__(self):
        self.ans = True

    def XXX(self, root: TreeNode) -> bool:
        # 思路就是编写一个函数，该函数可以返回指定节点为根节点的树的高度
        # 若某节点的左右子树的高度差大于1，则做一下标记，不要再继续判断其他节点了

        # 返回以root为根节点的树的高度
        def f(root: TreeNode):

            # 目前还是平衡树的话则进入判断
            if self.ans:

                # 计算左右子树的高度
                if not root: return 0
                left = 1 + f(root.left)
                right = 1 + f(root.right)

                # 判断高度差是否大于1
                if abs(left - right) > 1:
                    self.ans = False
                
                # 该树的高度是其左右子树高度的最大值
                return max(left, right)
            return 0

        self.ans = True
        if root: f(root)
        return self.ans

