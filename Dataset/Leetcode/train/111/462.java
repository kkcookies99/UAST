class Solution {
    public int XXX(TreeNode root) {
        if(root==null){return 0;}
		int left = XXX(root.left);
		int right = XXX(root.right);
		return left == 0 || right == 0 ? 1 + left + right : 1 + Math.min(left, right);
    }
}

