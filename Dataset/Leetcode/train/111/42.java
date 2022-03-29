class Solution {
    public int XXX(TreeNode root) {
        if(root==null) return 0;
        if(root.left!=null&&root.right!=null) 
            return Math.min(XXX(root.left),XXX(root.right))+1;
        return XXX(root.right)+XXX(root.left)+1;
    }
}

