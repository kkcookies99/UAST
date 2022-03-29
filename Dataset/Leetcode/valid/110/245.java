class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        if(XXX(root.left) && XXX(root.right)){
            int l = height(root.left);
            int r = height(root.right);
            if(Math.abs(l -r) <= 1) return true;
            return false;
        }else{
            return false;
        }
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        int l = height(root.left);
        int r = height(root.right);
        return Math.max(l, r)+1;
    }
}

