 class Solution {
    long pre = Long.MIN_VALUE;
    boolean flag = true;
    public boolean XXX(TreeNode root) {
        inOrder(root);
        return flag;
    }
    public void inOrder(TreeNode root)
    {
        if(root == null)
            return;
        inOrder(root.left);
        if(pre >= root.val){
            flag = false;
            return;
        }
        pre = root.val;
        inOrder(root.right);
    }
    
}

