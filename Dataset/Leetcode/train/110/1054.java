 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        int d = tall(root.left) - tall(root.right);
        if(d < -1 || d > 1) return false;
        if(XXX(root.left))
            return XXX(root.right);
        return false;
    }
    public int tall(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null)
            return 1;
        return Math.max(tall(root.left) + 1, tall(root.right) + 1);
    }
}

