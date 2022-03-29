 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root == null ){
            return false;
        }
        sum -= root.val;
        return  (sum == 0 && root.left == null && root.right == null) 
            || XXX(root.left, sum)
            ||XXX(root.right, sum) ;
    }   
}

