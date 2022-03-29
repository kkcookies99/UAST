 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isReverse(root.left, root.right);
    }

    public boolean isReverse(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        //左树的左节点和右树的右节点
        //左树的右节点和右树的左节点
        else if (left != null && right != null && left.val == right.val) {
            return isReverse(left.left, right.right) && isReverse(left.right, right.left);
        } else {
            return false;
        }
    }
}

