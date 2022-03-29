 class Solution {
    private long result=Long.MIN_VALUE;
    public boolean XXX(TreeNode root) {
        if(root==null){
            return true;
        }
        if(!XXX(root.left)||result>=root.val){
            return false;
        }
        result=root.val;
        return XXX(root.right);
    }
}

