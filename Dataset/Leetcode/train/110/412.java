class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null)return true;
        return Math.abs(ceil(root.left)-ceil(root.right))<=1
        &&XXX(root.left)&&XXX(root.right);
    }
    public int ceil(TreeNode root){
        if(root==null)return 0;
        return Math.max(ceil(root.left),ceil(root.right))+1;
    }
}

