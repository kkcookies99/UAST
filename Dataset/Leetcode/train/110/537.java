class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        return Math.abs(right - left) <= 1 && XXX(root.left) && XXX(root.right);
    }

    private int getDepth(TreeNode root){
        if(root == null )
            return 0;
        int left = getDepth(root.left)+1;
        int right = getDepth(root.right)+1;
        return Math.max(right,left);
    }
}

