class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null)
            return true;

        if(Math.abs(height(root.left) - height(root.right)) > 1)
            return false;
        return XXX(root.left) && XXX(root.right);
    }

    public int height(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}

