 class Solution {
    //中序遍历,看前一个数是否小于当前数
    private static long pre;
    public boolean XXX(TreeNode root) {
        pre = Long.MIN_VALUE;
        return help(root);
    }

    private static boolean help(TreeNode root){
        if(root==null) return true;
        boolean left = help(root.left);
        if(pre>=root.val) return false;
        pre = root.val;
        boolean right = help(root.right);
        return left&&right;
    }
}

