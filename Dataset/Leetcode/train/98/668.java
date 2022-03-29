 class Solution {
    Integer min = null;
    boolean flag = true;
    public boolean XXX(TreeNode root) {
        if (root == null) return true;
        XXX(root.left);
        int temp = root.val;
        if (min == null || temp > min) min = temp;
        else flag = false;
        XXX(root.right);
        return flag;
    }
}

