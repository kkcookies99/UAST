class Solution {
    public boolean XXX(TreeNode root) {
        return root==null ? true : XXX(root.left)&&XXX(root.right)&&(Math.abs(hmax(root.right)-hmax(root.left))<=1);
    }
    public int hmax(TreeNode root){
        return root==null ? 0:Math.max(hmax(root.left),hmax(root.right))+1;
    }
}

