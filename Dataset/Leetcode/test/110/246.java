class Solution {
    public boolean XXX(TreeNode root) {
        int res = getHight(root);
        if (res == -1) return false;
        return true;
    }

    int getHight(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int hl = getHight(root.left);
        int hr = getHight(root.right);
        int dif = hl - hr;
        if (hl == -1 || hr == -1 || dif > 1 || dif < -1) return -1;
        return hl > hr ? hl + 1 : hr + 1;
    }

}

