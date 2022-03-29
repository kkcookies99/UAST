class Solution {
    public boolean XXX(TreeNode root) {
        if (root != null){
            if (Math.abs(getHigh(root.left)-getHigh(root.right))<=1)
                return XXX(root.left) && XXX(root.right);
            else return false;
        }else return true;
    }
    private int getHigh(TreeNode root){
        if (root == null) return 0;
        else return Math.max(getHigh(root.left), getHigh(root.right)) + 1;
    }
}

