class Solution {
    public int XXX(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 1;
        if(root.left==null) return XXX(root.right)+1;
        if(root.right==null) return XXX(root.left)+1;
        return Math.min(XXX(root.left), XXX(root.right))+1;
    }
}

