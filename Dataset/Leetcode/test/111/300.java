class Solution {
    public int XXX(TreeNode root) {
        return depth(root);
    }


    private int depth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        int left = Integer.MAX_VALUE;
        if (root.left != null) {
            left = depth(root.left) + 1;
        }

        int right = Integer.MAX_VALUE;
        if (root.right != null) {
            right = depth(root.right) + 1;
        }
        return Math.min(left,right);
    }
}

