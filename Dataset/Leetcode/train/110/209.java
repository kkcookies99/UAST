class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        boolean temp = Math.abs(left - right) <= 1;
        if(!temp){
            return false;
        }
        return (temp && XXX(root.left) && XXX(root.right));
    }
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return (left >= right) ? left + 1 : right + 1;
    }
}

