 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        sum -= root.val;
        if(sum == 0 && root.left==null && root.right==null){
            return true;
        }
        if(XXX(root.left, sum) == false){
            return XXX(root.right, sum);
        }
        return true;
    }
}

