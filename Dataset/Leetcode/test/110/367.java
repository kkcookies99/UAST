class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null)return true;
        if(Math.abs(height(root.left)-height(root.right))>1){
            return false;
        }
        else{
            return XXX(root.left)&&XXX(root.right);
        }
    }
    public int height(TreeNode root){
        if(root==null)return 0;
        else if(root.left==null&&root.right==null){
            return 1;
        }
        else{
            return 1+Math.max(height(root.left),height(root.right));
        }
    }
}

