class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int left = XXX(root.left);
        int right = XXX(root.right);
        if(left == 0 || right == 0) return left + right + 1;
        return Math.min(left, right)  + 1; 
    }
}

