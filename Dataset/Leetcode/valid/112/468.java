 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root == null) return false;
        if(root.left == null && root.right == null){
            if(root.val == sum) return true;
            return false;
        }
        if(root.left != null){
            if(XXX(root.left, sum - root.val)){
                return true;
            }
        }
        if(root.right != null){
            if(XXX(root.right, sum - root.val)){
                return true;
            }
        }
        return false;
    }
}

