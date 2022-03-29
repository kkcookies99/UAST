 class Solution {
    public int XXX(TreeNode root) {
        if(root == null)
            return 0;
        int leftD = XXX(root.left);
        int rightD = XXX(root.right);
        return 1+Math.max(leftD, rightD);
    }
}

