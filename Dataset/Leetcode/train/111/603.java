 class Solution {
    public int XXX(TreeNode root) {
        if(root==null) return 0;
        int left=1+XXX(root.left);
        int right=1+XXX(root.right);
        if(left==1) return right;
        if(right==1) return left;
        return Math.min(left,right);
    }
}

