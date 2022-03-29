class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        else{
            int left_height = XXX(root.left);
            int right_height = XXX(root.right);
            return Math.max(left_height, right_height) + 1;
        }
    }
}

