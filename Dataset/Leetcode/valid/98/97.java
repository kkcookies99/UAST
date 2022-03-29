 class Solution {
   static Integer lastVal = null;
    public boolean XXX(TreeNode root) {
         if (root == null) return true;
        if (!XXX(root.left)) return false;
        if (lastVal != null && lastVal >= root.val) return false;
        lastVal = root.val;
        return XXX(root.right);
    }

}