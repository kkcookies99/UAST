class Solution {
    public int XXX(TreeNode root) {
            return recursion(root);
    }
    public int recursion(TreeNode root){
        if(root==null) return 0;
        return Math.max(recursion(root.left),recursion(root.right))+1;
    }
}

