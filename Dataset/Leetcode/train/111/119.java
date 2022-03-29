class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        int left = XXX(root.left);
        int right = XXX(root.right);
        if(root.left == null)
        	return right + 1;
        if(root.right == null)
        	return left + 1;
        return Math.min(left + 1, right + 1);
    }
}

