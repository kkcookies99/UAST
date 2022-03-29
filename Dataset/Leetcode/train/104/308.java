class Solution {
    public int XXX(TreeNode root) {
         if(root == null)return 0;
        int left = XXX(root.left) + 1;
        int right = XXX(root.right) + 1;
        return Math.max(left,right);
    }
}

