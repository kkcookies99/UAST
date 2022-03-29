 class Solution {
    public boolean XXX(TreeNode root) {
        return order(root, root);
    }
    public boolean order(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null)
            return true;
        
        if(root1 == null || root2 == null)
            return false;
        
        return order(root1.left, root2.right) && order(root1.right, root2.left) && root1.val == root2.val;
    }
}


