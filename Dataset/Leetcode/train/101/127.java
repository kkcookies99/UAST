 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null){
            return true;
        }
        return XXXChild(root.left,root.right);
    }

    private boolean XXXChild(TreeNode left,TreeNode right){
        if(left==null&&right==null){
            return true;
        }
        if(left==null||right==null){
            return false;
        }
        return XXXChild(left.left,right.right)&&XXXChild(left.right,right.left)&& left.val==right.val;
    }
}

