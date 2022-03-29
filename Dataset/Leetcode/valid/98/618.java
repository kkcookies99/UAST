 class Solution {
    int m=Integer.MIN_VALUE,n=0;
    boolean flag=true;

    public boolean XXX(TreeNode root) {
        if(root==null)return true;

        XXX(root.left);
        if(m<root.val||n==0)
            m=root.val;
        else flag=false;
        n++;
        XXX(root.right);
        
        return flag;
    }
}

