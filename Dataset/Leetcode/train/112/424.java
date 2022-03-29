 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root == null) return false;
        return root.val == sum && root.left == null && root.right == null ? true : XXX(root.left,sum-root.val) || XXX(root.right,sum-root.val);
    }
}

