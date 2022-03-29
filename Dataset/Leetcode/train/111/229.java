class Solution {
    public int XXX(TreeNode root) {
        if(root==null){
            return 0;
        }
         return XXXTreeNode(root);
    }
    public int XXXTreeNode(TreeNode root){
        if(root.left==null&&root.right==null){
            return 1;
        }else if(root.left==null){
            return XXXTreeNode(root.right)+1;
        }else if(root.right==null){
            return XXXTreeNode(root.left)+1;
        }else{
            return Math.min(XXXTreeNode(root.left),XXXTreeNode(root.right))+1;
        }
    }
}

