 class Solution {
    long pre = Long.MIN_VALUE;
    boolean result = true;
    public boolean XXX(TreeNode root) {
        if (root == null){
            return true;
        }
        if (root.left == null && root.right == null){
            return true;
        }
        mid_order(root);
        return result;
    }
    public void mid_order(TreeNode root){
        if (root != null){
            mid_order(root.left);
            if (root.val > pre){
                pre = root.val;
            }
            else {
                result = false;
            }
            mid_order(root.right);
        }
    }
}

