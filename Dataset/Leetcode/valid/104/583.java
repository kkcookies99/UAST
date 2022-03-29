class Solution {
    public int XXX(TreeNode root) {
        return d(root,0);
    }
    int d(TreeNode root,int deep){
        if(root==null)
        return deep;
        int r=d(root.right,deep+1);
        int l=d(root.left,deep+1);
        return Math.max(l,r);
    }
}

