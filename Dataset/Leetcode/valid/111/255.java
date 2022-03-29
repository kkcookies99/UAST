class Solution {
    public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int a = XXX(root.left);
        int b = XXX(root.right);
        if (a == 0 && b != 0) {
            return b + 1;
        } else if (a != 0 && b == 0) {
            return a + 1;
        }
        return Math.min(a,b) + 1;
    }
}

