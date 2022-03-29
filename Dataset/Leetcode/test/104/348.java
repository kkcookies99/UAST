class Solution {
    public int XXX(TreeNode root) {
        int max=0;
        if(root == null) return 0;
        max = 1 + Math.max(XXX(root.left), XXX(root.right));
        return max;
    }
}

