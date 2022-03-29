 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) return true;
        return compareLeftAndRight(root.left, root.right);
    }

    boolean compareLeftAndRight(TreeNode left, TreeNode right){
        return left == null && right == null 
                || left != null && right != null 
                    && left.val == right.val 
                    && compareLeftAndRight(left.left, right.right) 
                    && compareLeftAndRight(left.right, right.left);
    }
}

