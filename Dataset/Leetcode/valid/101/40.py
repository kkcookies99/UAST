 class Solution:
    def XXX(self, root: 'TreeNode') -> 'bool':
        if not root:
            return True
        else:
            return self.childTreeIsSymmetric(root.left, root.right)

    def childTreeIsSymmetric(self, p, q):
        # 递归结束条件：
        # 1. 两个节点都为空
        # 2. 一个为空，另一个非空
        # 3. 都为非空，但是值不相等
        # 4. 都为非空，但是值相等（再次进入递归）
        if not p or not q:
            # 条件12
            return p == q
            # 条件1返回True，条件2返回False
        if p.val != q.val:
            return False
            # 条件3
        # 条件4
        return self.childTreeIsSymmetric(p.left, q.right) & self.childTreeIsSymmetric(p.right, q.left)

