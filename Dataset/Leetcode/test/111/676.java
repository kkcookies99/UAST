 class Solution {
    public int XXX(TreeNode root) {
        //需要有一个变量记录当前节点的深度
        //需要一个变量记录当前的最小深度
        int dp=1;
        int minDp=Integer.MAX_VALUE;
        if(root==null) return 0;
        return calMinDepth(root,1,minDp);

    }
    private int calMinDepth(TreeNode root,int dp,int minDp){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        if(root.left==null && root.right==null){
            return minDp=Math.min(dp,minDp);
        }
        
        return Math.min(calMinDepth(root.left,dp+1,minDp),calMinDepth(root.right,dp+1,minDp));
    }
}

