 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        return XXX(root.left, root.right);
    }

    private boolean XXX(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        else if(left == null || right == null) return false;
        if(left.val != right.val) return false;

        // 相互比较
        if(XXX(left.left, right.right) 
            && XXX(left.right, right.left)) return true;
        
        return false;
    }
}

