 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        st=[]
        prev=None
        while st or root:
            while root:
                st.append(root)
                root=root.left
            root=st.pop()
            if prev and root.val<=prev.val:
                return False
            prev=root
            root=root.right
        return True

