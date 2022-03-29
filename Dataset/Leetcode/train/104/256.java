class Solution {
    public int XXX(TreeNode root) {
        if(root==null)return 0;
        else return Math.max(XXX(root.right),XXX(root.left))+1;
    }
}

