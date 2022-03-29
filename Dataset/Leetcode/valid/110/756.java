 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) return true;
        System.out.println(depth(root));
        return is_balanced(root);
    }
    
    public int depth(TreeNode root){
        if (root == null) return 0;
        return Math.max(depth(root.left) +1 , depth(root.right) + 1);
    }
    
    public boolean is_balanced(TreeNode root){
        if (root == null) return true;
        if(Math.abs(depth(root.left) - depth(root.right))>1) return false;
        return is_balanced(root.left) && is_balanced(root.right);
    }                                      
}

