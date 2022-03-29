class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) {
            return 1;
        }
        int lefthigh = XXX(root.left);
        int righthigh = XXX(root.right);
        int max = Math.max(lefthigh,righthigh);
        return max+1;
    }
}

