 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return root.val == targetSum;
        }
        return XXX(root.left, targetSum - root.val) || XXX(root.right, targetSum - root.val);
    }
}

