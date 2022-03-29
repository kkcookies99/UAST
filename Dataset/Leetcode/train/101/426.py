 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return True
        if not root.left and not root.right:
            return True

        def check(lc,rc):
            if not lc and not rc:
                return True
            if lc and rc:
                if lc.val != rc.val:
                    return False
            else:
                return False
            # 左子树前序遍历
            # 右子树后序遍历
            ok1 = check(lc.left,rc.right)
            if not ok1:
                return False
            ok2 = check(lc.right,rc.left)
            return ok2

        return check(root.left,root.right)

