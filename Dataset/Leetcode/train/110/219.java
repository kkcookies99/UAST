class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null)return true;
        int h1=height(root.right);
        int h2=height(root.left);
        if(Math.abs(h1-h2)>1)return false;
        return XXX(root.left)&&XXX(root.right);
    }
    int height(TreeNode root){
        if(root==null)return 0;
        return 1+Math.max(height(root.right),height(root.left));
    }
}

