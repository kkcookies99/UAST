class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){return true;}
        if(Math.abs(hroot(root.left) - hroot(root.right)) <= 1 ){
            return XXX(root.left) && XXX(root.right);
        }
        return false;

    }

    public int hroot(TreeNode root){
        if(root == null){ return 0; }
        return 1+ Math.max(hroot(root.left) , hroot(root.right));
    }
}

