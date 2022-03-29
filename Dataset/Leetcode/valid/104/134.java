class Solution {
    public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }
        //树的高度=左子树，右子树高度最大值+1
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
    
    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
}

