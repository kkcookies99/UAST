 class Solution {
    int pre = 0;
    boolean flag = false;
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        
        boolean left = XXX(root.left);
        if(!flag) {
            flag = true;
        } else if(root.val <= pre) {
            return false;
        }
        pre = root.val;
        boolean right = XXX(root.right);
        return left && right;
    }
}

