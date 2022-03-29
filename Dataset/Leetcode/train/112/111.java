class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root == null) return false;
        flag = false;
        trace(root, root.val, sum);
        return flag;
    }
    public boolean flag;
    public void trace(TreeNode root, int pathSum, int target) {
        if(pathSum == target){
            //如果结点为叶子并且路径和为target，则找到符合的路径
            if(root.left == null && root.right == null){
                flag = true;
                return ;
            }
        }
        if(root != null) {
            if(root.left != null)   //探索左边路径
                trace(root.left, pathSum + root.left.val, target);
            
            if(root.right != null)  //探索右边路径
                trace(root.right, pathSum + root.right.val, target);     
        }
    }
}

