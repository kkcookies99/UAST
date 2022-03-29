class Solution {
    public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }
        return getHeight(root);

    }

    public int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return Math.max(leftHeight,rightHeight) + 1;
    }
}

