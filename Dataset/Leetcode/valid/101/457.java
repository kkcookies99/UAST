 class Solution {
    public boolean XXX(TreeNode root) {
        return XXX(root, root);
    }

    public boolean XXX(TreeNode left, TreeNode right) {
        if (left == null && right == null){
            return true;
        } 

        if (left == null || right == null || left.val != right.val){
            return false;
        }

        return XXX(left.left, right.right) && XXX(left.right, right.left);

    }
}```

