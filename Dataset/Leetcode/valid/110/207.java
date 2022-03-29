class Solution {
    public boolean XXX(TreeNode root) {
        return root==null?true:Math.abs(depth(root.left)-depth(root.right))<=1&&XXX(root.left)&&XXX(root.right);
    }
    private int depth(TreeNode root){
        return root==null?0:Math.max(depth(root.left),depth(root.right))+1;
    }
}


