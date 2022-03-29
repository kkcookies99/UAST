class Solution {
    public int XXX(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int m = XXX(root.left);
        int n = XXX(root.right);
        
        return m > n ? m + 1 : n + 1;
    }
}

