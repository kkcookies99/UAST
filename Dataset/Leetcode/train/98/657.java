 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        } else if (root.left == null && null == root.right) {
            return true;
        } else if (root.left != null && null == root.right) {
            return  maxValLeft(root.left) < root.val && XXX(root.left);
        } else if (root.left == null && null != root.right) {
            return root.val < minValRight(root.right) && XXX(root.right);
        } else {
            // 左右分别都是BST，且左子树最大值 < 当前 node.val < 右子树最小值
            return maxValLeft(root.left) < root.val
                && root.val < minValRight(root.right) && XXX(root.left) && XXX(root.right);
        }
    }

    private int maxValLeft(TreeNode left) {
        if (left.right == null) {
            return left.val;
        } else {
            return maxValLeft(left.right);
        }
    }

    private int minValRight(TreeNode right) {
        if (right.left == null) {
            return right.val;
        } else {
            return maxValLeft(right.left);
        }
    }
}

