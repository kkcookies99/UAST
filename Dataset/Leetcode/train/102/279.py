class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        res = [[root.val]]
        t = []
        s = [root]
        st = []
        while s:
            p = s.pop(0)          
            if p.left:
                t.append(p.left.val)
                st.append(p.left)
            if p.right:
                t.append(p.right.val)
                st.append(p.right)
            if s == [] and t:
                res.append(t[:])
                t = []
                s = st[:]
                st = []
        return res 

