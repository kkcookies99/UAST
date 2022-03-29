 class Solution {
    long midValue= Long.MIN_VALUE;
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        boolean left=XXX(root.left);
        boolean mid = false;
        if(root.val>midValue) {
            mid=true;
            midValue=root.val;
        }
        boolean right= XXX(root.right);
        return left&&mid&&right;

    }
}

