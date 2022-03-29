 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null && root.val == sum) // 当前结点必须是叶子结点
            return true;
        return XXX(root.left, sum - root.val) || XXX(root.right, sum - root.val);
    } 
}

