 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        return judge(root.left,root.right);
    }
    private boolean judge(TreeNode tn1,TreeNode tn2){
        if(tn1==null && tn2==null) return true;
        if(tn1==null && tn2!=null) return false;
        if(tn1!=null && tn2==null) return false;
        if(tn1.val!=tn2.val) return false;

        return judge(tn1.left,tn2.right) && judge(tn1.right,tn2.left);
    }
}

