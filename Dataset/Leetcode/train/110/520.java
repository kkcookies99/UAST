class Solution {
    public boolean XXX(TreeNode root) {
         if(root == null){
             return true;
         }
         if(Math.abs(getHeigh(root.left)-getHeigh(root.right)) <= 1){
             return XXX(root.left) && XXX(root.right);
         }
         return false;
    }

    public int getHeigh(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(getHeigh(root.left),getHeigh(root.right))+1;
    }
}

