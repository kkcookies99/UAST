class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if(root==null){
                return false;
        }
        if(root.right==null&&root.left==null&&root.val==targetSum)
            return true;
        return XXX(root.left, targetSum-root.val)||XXX(root.right, targetSum-root.val);
    }
}

