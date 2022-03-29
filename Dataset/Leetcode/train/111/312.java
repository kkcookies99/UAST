class Solution {
    public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }
        int l = XXX(root.left);
        int r = XXX(root.right);
        // 两个值都不为零　取最小
        if(r!=0 && l!=0){
            return Math.min(r,l)+1;
        }
        // 两个值存在一个为零或两个都为零，取最大
        else{
            return Math.max(r,l)+1;
        }
        
    }
}

