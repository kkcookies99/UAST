 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        ret, st, n = [], [], root
        while n or st:
            while n:
                st.append(n)
                n = n.left
            n = st.pop()
            ret.append(n.val)
            n = n.right
        return ret

