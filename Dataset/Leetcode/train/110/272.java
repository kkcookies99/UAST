class Solution {
    public boolean XXX(TreeNode root) {
        return root==null ? true : Math.abs(getDepth(root.left)-getDepth(root.right))<=1 && XXX(root.left) && XXX(root.right);
    }
    private int getDepth(TreeNode root){
        return root==null ? 0 : Math.max(getDepth(root.left), getDepth(root.right))+1;
    }
}

