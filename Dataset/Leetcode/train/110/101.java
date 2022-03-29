class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        if(checkDepth(root) == -1) return false;
        return true;
    }
    public int checkDepth(TreeNode root){
        if(root == null) return 0;
        int left = checkDepth(root.left);
        if(left == -1) return -1;
        int right = checkDepth(root.right);
        if(right == -1) return -1;
        int diff = Math.abs(left - right);
        if(diff > 1) return -1;
        return 1 + Math.max(left, right);
        
    }
}

