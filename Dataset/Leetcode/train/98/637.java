 class Solution {
    long preValue = Long.MIN_VALUE;
    public boolean XXX(TreeNode root) {
        return judge(root);
    }

    public boolean judge(TreeNode root){
        if(root==null){
            return true;
        }
        boolean l = judge(root.left);
        if(root.val<=preValue){
            return false;
        }
        preValue = root.val;
        boolean r = judge(root.right);
        return l && r;
    }
}

