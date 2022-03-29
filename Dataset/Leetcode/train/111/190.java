class Solution {
    public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        } 
        return minmy(root);
    }
    private int minmy(TreeNode p){
        if(p == null){
            return Integer.MAX_VALUE;
        }
        if(p .left == null && p.right == null){
            return 1;
        }
        int lD = minmy(p.left);
        int rD = minmy(p.right);
        return Math.min(lD,rD)+1;
    }

}

