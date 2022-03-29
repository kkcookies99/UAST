class Solution {
    public boolean XXX(TreeNode root) {
        return isBT(root) == -1 ? false : true;
    }
    //平衡二叉树的左右子树也都是平衡的，且它的左右子树高度之差不超过1
    //递归函数的返回值有二义性，-1表示该树不平衡，非负数代表树的高度
    public int isBT(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = isBT(root.left);
        int right = isBT(root.right);
        //左右子树不平衡
        if (left == -1 || right == -1) {
            return -1;
        }
        int differ = Math.abs(left - right);
        //左右子树高度差大于1
        if (differ > 1) {
            return -1;  
        } else {   //返回树的高度
            return Math.max(left, right) + 1;
        }
        
    }
}

