class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) return true;
        boolean curNode = true;
        if (Math.abs(getHeight(root.left)-getHeight(root.right)) > 1) {
            curNode = false;
        }
        return curNode && XXX(root.left) && XXX(root.right);
    }

    public int getHeight(TreeNode node) {
        if (node == null) return 0;
        else if (node.left == null && node.right != null) return getHeight(node.right) + 1;
        else if (node.left != null && node.right == null) return getHeight(node.left) + 1;
        else {
            int l = getHeight(node.left);
            int r = getHeight(node.right);
            return l > r ? l+1 : r+1; 
        }
    }
}

