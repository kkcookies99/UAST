class Solution {
    public boolean XXX(TreeNode root) {
        return digui(root)>=0;
    }

    public int digui(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left = digui(root.left);
        int right = digui(root.right);
        if(left<0 || right<0 || left-right>1 || right-left>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }
}

