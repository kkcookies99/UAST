 class Solution {
    public static double max=Double.NEGATIVE_INFINITY;
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        if(XXX(root.left)){
            if(max<root.val){
                max=root.val;
                return XXX(root.right);
            }
        }
        return false;

    }
}

