 class Solution {
    long pre = Long.MIN_VALUE;
    long cur;

    boolean res = true;
    public boolean XXX(TreeNode root) {
        getArray(root);
        return res;
    }

    public void getArray(TreeNode root) {
        if (root == null) return;

        XXX(root.left);

        cur = root.val;
        if (pre >= cur) {
            res = false;
            return ;
        }
        pre = cur;
       
        XXX(root.right);
    }
}

