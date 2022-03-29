class Solution {
    public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(XXX(root.left),XXX(root.right))+1;
    }
}

