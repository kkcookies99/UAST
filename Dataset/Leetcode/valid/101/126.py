 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return True
        dummy = TreeNode('1')
        st = [root.left, root.right]
        while st:
            left = st.pop()
            right = st.pop()
            if not left or not right:
                if left or right:
                    return False
                continue
            if left.val != right.val:
                return False
            ll, lr = left.left, left.right
            rl, rr = right.left, right.right
            st.extend((ll,rr,lr,rl))
        return True