class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        int diff=Math.abs(height(root.left)-height(root.right));
        return diff<=1 && XXX(root.left) && XXX(root.right);

    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }
}

