class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null)
            return true;
        return XXX(root.left) && XXX(root.right) && Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1;
    }
    public int getHeight(TreeNode node){
        if(node == null)
            return 0;
        else return 1 + Math.max(getHeight(node.left),getHeight(node.right));
    }
}

