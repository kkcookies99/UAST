 class Solution {

    private TreeNode pre;
    private boolean flag;

    public boolean XXX(TreeNode root) {
        if(root == null)
            return true;
        if(root.left == null && root.right == null)
            return true;
        flag = true;
        pre = null;
        inOrder(root);
        return flag;
    }

    public void inOrder(TreeNode root) {
        if(root == null)
            return;
        inOrder(root.left);
        if(pre == null) { //pre记录上次访问的节点
            pre = root;
        } else if(root.val <= pre.val) {
            flag = false;
            return;
        }
        pre = root;
        inOrder(root.right);
    }
}

