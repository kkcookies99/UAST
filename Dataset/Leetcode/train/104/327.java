class Solution {
    public int XXX(TreeNode root) {
        if(root == null)
            return 0;
        int maxLeft = XXX(root.left);
        int maxRight = XXX(root.right);
        return maxLeft > maxRight ? maxLeft+1:maxRight+1;
    }
    
}

