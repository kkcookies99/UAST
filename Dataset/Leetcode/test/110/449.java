class Solution {
    public boolean XXX(TreeNode root) {
if (root==null)return true;
        else return Math.abs(getDeep(root.left)-getDeep(root.right))<=1&&XXX(root.right)&&XXX(root.left);

    }
    private static int getDeep(TreeNode root){
        if (root==null)return 0;
        else return 1+Math.max(getDeep(root.left),getDeep(root.right));
    }
}

