 class Solution(object):
    def XXX(self, root):
        def zcc(root):
            if not root:
                return []
            left = zcc(root.left)
            right = zcc(root.right)
            return left + [root.val] + right
        ret = zcc(root)
        return ret == sorted(ret) and len(ret) == len(set(ret))

