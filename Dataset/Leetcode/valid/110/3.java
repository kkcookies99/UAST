class Solution {
    public boolean XXX(TreeNode root) {
    	if(root == null)
    		return true;

    	if(Math.abs(helper(root.left) - helper(root.right)) > 1){
    		return false;
    	}

    	return XXX(root.left) && XXX(root.right);
    }

    public int helper(TreeNode node){
    	if(node == null)
    		return 0;

    	int left = helper(node.left);
    	int right = helper(node.right);

    	return Math.max(left, right) + 1;
    }
}

