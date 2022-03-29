class Solution {
    public int XXX(TreeNode root) {
        return getLen(root);
    }

    public int getLen(TreeNode root) {
        if (root == null) {
            return 0 ;
        }
        int left = getLen(root.left);
        int right = getLen(root.right);
        return (left > right ? left : right) + 1;

    }
}

