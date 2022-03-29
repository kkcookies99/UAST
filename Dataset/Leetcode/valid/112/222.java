 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if (root == null ){
			return false;
		}else if (root.left == null && root.right == null ){
			return root.val == targetSum;
		}
		targetSum = targetSum - root.val;
		return XXX(root.right,targetSum) || XXX(root.left,targetSum);
    }
}

