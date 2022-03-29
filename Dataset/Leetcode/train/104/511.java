class Solution {
    public int XXX(TreeNode root) {
        //递归终止条件:root为空
		if(root == null)
			return 0;
		//递归需要做什么:求出左子树、右子树的最大深度
		int left = XXX(root.left);
		int right = XXX(root.right);
		//返回的值：左子树、右子树数中的最大深度值加1
		return Math.max(left,right) + 1;
    }
}

