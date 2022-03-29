 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
    	if(root==null) return false;
    	targetSum -= root.val;
    	if(root.left==null&&root.right==null&&targetSum==0) return true;
    	return XXX(root.left,targetSum)||XXX(root.right,targetSum);
    }
}

