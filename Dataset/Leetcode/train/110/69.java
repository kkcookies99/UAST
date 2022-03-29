class Solution {
    public boolean XXX(TreeNode root) {
     
       if (root == null) return true;
       //左子树是平衡树，右子树也是平衡树并且深度差值不超过1 
       return XXX(root.left) && XXX(root.right) && (Math.abs(depth(root.left) - depth(root.right)) > 1 ? false : true); 
    }
    
    private int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(depth(root.left),  depth(root.right)) + 1;
    }
}

