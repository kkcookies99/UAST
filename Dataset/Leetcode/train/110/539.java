class Solution {
    public boolean XXX(TreeNode root) {
        return getAvgDeepth(root)!=-1;
    }
    public int getAvgDeepth(TreeNode root){
        if(root==null){ return 0; }
        int leftDeepth=getAvgDeepth(root.left);
        if(leftDeepth==-1){
            return -1;
        }
        int rightDepth=getAvgDeepth(root.right);
        if(rightDepth==-1){
            return -1;
        }
        if(Math.abs(rightDepth-leftDeepth)>1){
            return -1;
        }
        return Math.max(leftDeepth,rightDepth)+1;
    }
}

