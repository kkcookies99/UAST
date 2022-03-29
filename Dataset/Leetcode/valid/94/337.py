 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        ret = []
        def zcc(root):
            if not root:
                return
            zcc(root.left)
            ret.append(root.val)
            zcc(root.right)
        zcc(root)
        return ret

