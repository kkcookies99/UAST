 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null)return true;
        return recursion(root.left,root.right);
    }

    public  boolean recursion(TreeNode node1,TreeNode node2){
        if(node1 == null && node2 == null)return true;
        if(node1 != null && node2 != null)
            return node2.val == node1.val && recursion(node1.left,node2.right) && recursion(node1.right,node2.left);
        return false;
    }
}

