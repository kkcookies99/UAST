 class Solution {
 public boolean XXX(TreeNode root) {
        return XXXbyMinAndMax(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    public boolean XXXbyMinAndMax(TreeNode node,long max,long min){
        if (node==null) {
            return  true;
        }
        if(node.val<=min||node.val>=max) {
            return false;
        }
        return XXXbyMinAndMax(node.left, node.val, min) && XXXbyMinAndMax(node.right, max, node.val);
    }
}

