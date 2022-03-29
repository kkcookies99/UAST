 class Solution {
    public boolean XXX(TreeNode root) {
        return process(root) == -1 ? false : true;
    }
    
    public int process(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int l = process(root.left);
        if(l == -1) {
            return -1;
        }
        int r = process(root.right);
        if(r == -1) {
            return -1;
        }
        
        return Math.abs(l - r) > 1 ? -1 : Math.max(l, r) + 1;
    }
}

