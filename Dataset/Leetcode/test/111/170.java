class Solution {
    public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null){
            return XXX(root.right) + 1;
        }
        if(root.right == null){
            return XXX(root.left) + 1;
        }
        int left  =  XXX(root.left);
        int right =  XXX(root.right);
        return Math.min(left,right) + 1;
    }
}

