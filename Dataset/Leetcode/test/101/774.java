 class Solution {
    public boolean XXX(TreeNode root) {
        return root==null ? true : XXX(root.left, root.right);
    }

    public boolean XXX(TreeNode left,TreeNode right){
        return (left==null || right==null) && left!=right ? false : (left==right ? true : (left.val != right.val ? false : XXX(left.left, right.right) && XXX(left.right, right.left)));
    }
}

