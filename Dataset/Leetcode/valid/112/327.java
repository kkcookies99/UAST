 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if(root==null) return false;
        if(root.left==null&&root.right==null){
            return root.val==targetSum ? true : false;
        }
        if(root.left==null) return XXX(root.right, targetSum-root.val);
        if(root.right==null) return XXX(root.left, targetSum-root.val);
        return XXX(root.left, targetSum-root.val)||XXX(root.right, targetSum-root.val);
    }
}

