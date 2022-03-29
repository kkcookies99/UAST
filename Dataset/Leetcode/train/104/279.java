class Solution {
    public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftHeight = XXX(root.left);
        int rightHeight = XXX(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

