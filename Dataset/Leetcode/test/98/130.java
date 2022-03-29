 class Solution {
    double prev = -Double.MAX_VALUE;
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        if(!XXX(root.left)) return false;
        if(root.val <= prev) return false;
        prev = root.val;
        return XXX(root.right);
    } 
    
}

