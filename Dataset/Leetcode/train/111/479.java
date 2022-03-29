class Solution {
    public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDepth = XXX(root.left);
        int rightDepth = XXX(root.right);
        if(root.left == null){
            return rightDepth+1;
        }else if(root.right == null){
            return leftDepth+1;
        }else{
            return Math.min(leftDepth,rightDepth) + 1;
        }
    }
}

