class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0; 
        if(root.left == null && root.right == null) return 1;
        int max_depth = 0;
        if(root.left != null) max_depth = Math.max(XXX(root.left),max_depth);
        if(root.right != null) max_depth = Math.max(XXX(root.right),max_depth);
        return max_depth + 1;
    }   
}

