 class Solution {
    public boolean XXX(TreeNode root) {
        TreeNode root_r = btReverse(root);
        return btEquals(root, root_r);
    }
    public TreeNode btReverse(TreeNode root) {
        if (root == null) return root;
        btReverse(root.left);
        btReverse(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
    public boolean btEquals(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        } 
        return btEquals(root1.left, root2.left) && btEquals(root1.right, root2.right);
    }
}

