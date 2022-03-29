class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        if(Math.abs(heigth(root.left) - heigth(root.right)) <= 1){
            return XXX(root.left) && XXX(root.right);
        }else{
            return false;
        }

    }
    /**
        求子树的高度
     */
    public int heigth(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(1+heigth(root.left), 1+heigth(root.right));
    }
}

