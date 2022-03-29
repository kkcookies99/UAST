 class Solution {
    TreeNode temp;
    boolean right=true;
    boolean left=true;
    public boolean XXX(TreeNode root) {
        //前序遍历 左 根 右
        if (root==null) return true;
        if (root.left!=null) {
             right = XXX(root.left);
        }
        if (temp==null) {
            temp=root;
        }else {
            if (root.val<=temp.val) return false;
            else temp.val=root.val;
        }
        if (root.right!=null) {
            left = XXX(root.right);
        }
        return right&&left;
    }
}

