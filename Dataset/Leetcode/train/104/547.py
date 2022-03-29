class Solution:
    def XXX(self, root: TreeNode) -> int:
        if root is None:
            return 0
        st = list()
        res = 0
        while st or root:
            while root:
                st.append(root)
                root = root.left if root.left else root.right
            res = max(res, len(st))
            root = st.pop()
            if st and root is st[-1].left:
                root = st[-1].right
            else:
                root = None
        return res

