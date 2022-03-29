class Solution {
    public int XXX(TreeNode root) {
        if(root==null) return 0;
        if(root.left!=null&&root.right==null)return 1+XXX(root.left);
        if(root.right!=null&&root.left==null)return 1+XXX(root.right);
        else return Math.min(XXX(root.left),XXX(root.right))+1;
    }
}

