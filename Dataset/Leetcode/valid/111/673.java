 class Solution {
    public int XXX(TreeNode root) {
        if(root==null) return 0;
        // null节点不参与比较
        if (root.left == null && root.right != null) {
            return 1 + XXX(root.right);
        }
        // null节点不参与比较
        if (root.right == null && root.left != null) {
            return 1 + XXX(root.left);
        }
        return Math.min(XXX(root.left),XXX(root.right))+1;
    }
}

