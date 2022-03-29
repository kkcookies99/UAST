class Solution {
    public int XXX(TreeNode root) {
        int count = 0 ;
        return depthSearch(root,count) ;
    }

    private int depthSearch(TreeNode node,int depth){
        if(null == node){
            return depth ;
        }
        depth++ ;
        return Math.max(depthSearch(node.left,depth),depthSearch(node.right,depth)) ;
    }
}

