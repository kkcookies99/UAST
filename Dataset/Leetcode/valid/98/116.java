 class Solution {
    long prev = Long.MIN_VALUE;
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        boolean left = XXX(root.left);
        if(prev>=root.val) return false;
        prev=root.val;
        boolean right= XXX(root.right);
        return left&&right;
    }
}

