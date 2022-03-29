 class Solution {
    public boolean XXX(TreeNode root) {
        return treeHeight(root)!=-1;
    }

    /**
     * x为null             返回0
     * x非null且是平衡树    返回该树的高度
     * x非null且不是平衡树  返回-1
     */
    private int treeHeight(TreeNode x){
        if(x==null) return 0;
        int lh=treeHeight(x.left);
        int rh=treeHeight(x.right);
        if(lh==-1||rh==-1) return -1;
        else if(Math.abs(lh-rh)<=1) return Math.max(lh,rh)+1;
        else return -1;
    }
}

