class Solution {
    public boolean XXX(TreeNode root, int sum) {

        if (root == null){
            return false;
        }

        if (root.val == sum && root.left == null && root.right == null){
            return true;
        }

        if (root.left != null){
            root.left.val += root.val;
            XXX(root.left, sum);
        }

        if (root.right != null){
            root.right.val += root.val;
            XXX(root.right, sum);
        }

        return false;

    }
}

