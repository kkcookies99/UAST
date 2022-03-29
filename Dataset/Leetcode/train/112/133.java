class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        int diff = targetSum - root.val;
        if (root.left == null && root.right == null){
            if (diff != 0){
                return false;
            }
            return true;
        }
        return XXX(root.left,diff) || XXX(root.right,diff);
    }
}

