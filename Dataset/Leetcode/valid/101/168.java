 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        return XXX(root.left, root.right);
    }

    /**
        递归的函数
     */
    private boolean XXX(TreeNode leftRoot, TreeNode rightRoot){
        if(leftRoot == null && rightRoot == null){
            return true;
        }

        if(leftRoot == null || rightRoot == null || leftRoot.val != rightRoot.val){
            return false;
        }
        return XXX(leftRoot.left, rightRoot.right) && XXX(leftRoot.right, rightRoot.left);
    }

