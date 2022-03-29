class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }

        int gap = height(root.left) - height(root.right);

        return -1<=gap && gap<=1 && XXX(root.left) && XXX(root.right);

    }

    public int height(TreeNode root){
        if(root == null){
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }
}

