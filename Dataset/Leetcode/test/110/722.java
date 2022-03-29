 class Solution {
    public boolean XXX(TreeNode root) {
        return height(root)!=-1;
    }
    
    private int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        if(left==-1){
            return -1;
        }
        int right=height(root.right);
        if(right==-1||Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }
}

