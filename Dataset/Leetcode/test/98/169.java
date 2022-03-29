 class Solution {
    public boolean XXX(TreeNode root) {
        if(root.left == null && root.right == null)
            return true;
        if(root.left == null)
            return root.val < min(root.right) && XXX(root.right);
        if(root.right == null)
            return root.val > max(root.left) && XXX(root.left);
        return root.val > max(root.left) && root.val < min(root.right) && XXX(root.right) && XXX(root.left);
    }

    public int max(TreeNode root){
        if(root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    public int min(TreeNode root){
        if(root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }
}

