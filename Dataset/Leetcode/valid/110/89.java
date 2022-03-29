class Solution {
    public boolean XXX(TreeNode root) {
	   if(root == null) return true;
       int ret = dfs(root);
       return ret == -1 ? false : true; 
	}
	
	public int dfs(TreeNode root) {
		if(root == null) return 0;
		int left = dfs(root.left);
		int right = dfs(root.right);
		if(left >= 0 && right >= 0 && Math.abs(left - right) <= 1) {
			return left > right ? left + 1 : right + 1;
		}
		return -1;
	}
}
