 class Solution {
    boolean res=true;
    long pre=Long.MIN_VALUE;
    public boolean XXX(TreeNode root) {
        XXXhelper(root);
        return res;
    }

    private void XXXhelper(TreeNode node) {
        if(node!=null){
            XXXhelper(node.left);
            if(node.val<=pre) res=false;//加一行
            pre=node.val;
            XXXhelper(node.right);
        }
    }
}

