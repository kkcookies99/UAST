class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        //左、右子树深度
        int left = XXX(root.left);
        int right = XXX(root.right);
        //左(右)子树为空，深度为右(左)子树深度+当前节点深度1
        if(left == 0) return right + 1;
        if(right == 0) return left + 1;
        //左、右子树不为空，深度为左、右子树深度较小者+当前节点深度1
        return Math.min(left, right) + 1;
    }
}

