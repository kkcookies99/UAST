class Solution {
    public int XXX(TreeNode root) {
        if(root==null)
            return 0;
        int left = XXX(root.left);
        int right = XXX(root.right);
        if(left>0 && right>0)
            return Math.min(left,right)+1;
        return left==0 ? right+1 :left+1;
    }
}

