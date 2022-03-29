 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        //均为空，则相同
        if (p == null && q == null) return true;
        //一个为空一个不空，则不同
        if (p == null || q == null) return false;
        //对应值不等，则不同
        if (p.val != q.val) return false;
        //递归，判断左子树和右子树是否相同
        return XXX(p.left, q.left) && XXX(p.right, q.right);

    }
}

