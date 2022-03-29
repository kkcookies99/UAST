 class Solution {
    TreeNode cur=null;
    public boolean XXX(TreeNode root) {
        if(root==null)return true;
        boolean l=XXX(root.left);
        if(cur!=null&&root.val<=cur.val)return false;
        cur=root;
        boolean r=XXX(root.right);
        return l&r;
    }
}

