class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        int left = XXX(root.left);
        int right = XXX(root.right);
        if(root.left == null && root.right == null) return 1;
        if(root.left == null && root.right != null) return right+1;
        if(root.left != null && root.right == null) return left+1;
        return Math.min(left,right)+1;
    }
}

