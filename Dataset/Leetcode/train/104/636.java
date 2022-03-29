 class Solution {
    public int XXX(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return XXXHelper(root, 0);
	}

	public int XXXHelper(TreeNode root, int depth) {
		if (root == null) {
            return depth;
        }
		int left = XXXHelper(root.left, depth + 1);
		int right = XXXHelper(root.right, depth + 1);
		return left > right ? left : right;
	}
}

