class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def getHeight(root: TreeNode) -> int:
            if not root:
                return 0
            l_h = getHeight(root.left)
            if l_h == -1:
                return -1
            r_h = getHeight(root.right)
            if r_h == -1:
                return -1
            # 当前节点的高度 1 + max(l_h, r_h)
            return 1 + max(l_h, r_h) if -2 < l_h - r_h < 2 else -1

        return True if getHeight(root) != -1 else False

