 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        else if (root.left == null && root.right == null && root.val == targetSum){
            return true;
        }
        return XXX(root.left,targetSum-root.val) || XXX(root.right,targetSum-root.val);
    }
}

