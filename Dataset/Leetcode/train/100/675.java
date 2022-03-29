 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            // 如果一个是null，另一个不是null。两个树肯定不相等
            return false;
        }

        if (p.val != q.val) {
            return false;
        } else {
            // 如果两个父节点相等，递归看子节点是否都相等
            return XXX(p.left, q.left) && XXX(p.right, q.right);
        }
    }
}

