 class Solution {
    public boolean XXX(TreeNode root) {
        if (root==null){
            return true;
        }
        return judge(root.left,root.right);
    }
    public boolean judge(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null) return true;
        if (root1!=null && root2!=null &&root1.val==root2.val){
            return judge(root1.left,root2.right)&&judge(root1.right,root2.left);
        }
        else return false;
    }
}

