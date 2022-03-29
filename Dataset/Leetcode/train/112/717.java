 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null && sum == root.val) {
            return true;
        } 
        if(root.left == null && root.right == null && sum != root.val) {
            return false;
        }
        //当前阶段工作
        return XXX(root.left,sum-root.val) || XXX(root.right,sum-root.val);
    }
}

