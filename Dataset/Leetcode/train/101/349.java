 class Solution {
    public boolean XXX(TreeNode root) {
        return isGay(root.left,root.right);
    }
    public boolean isGay(TreeNode t1,TreeNode t2){
        if(t1 == null&& t2 == null ) return true;
        else if(t1 == null||t2 == null) return false;
        else if(t1.val != t2.val) return false;
        else{
            return isGay(t1.left,t2.right)&&isGay(t1.right,t2.left);
        }
    }
}

