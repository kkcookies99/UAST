class Solution {
    public boolean XXX(TreeNode root) {

        if (root == null) {
            return true;
        }
        if (XXX(root.left)) {
            if (Math.abs(high(root.left) - high(root.right)) <= 1) {
                return XXX(root.right);
            }
        }
        return false;
    }

    private int high(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(high(root.left), high(root.right)) + 1;
    }
}

