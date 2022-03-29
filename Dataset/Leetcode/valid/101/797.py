 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        # 递归部分 检查两棵树是否对称
        def check(rootL, rootR):
            if rootL == None and rootR == None:
                return True
            elif rootL and rootR and rootL.val == rootR.val:
                return check(rootL.right, rootR.left) and check(rootL.left, rootR.right)
            else:
                return False
        if root == None:
            return True
        else:
            return check(root.left, root.right)

