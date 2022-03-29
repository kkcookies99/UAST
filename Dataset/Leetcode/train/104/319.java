class Solution {
    public int XXX(TreeNode root) {
        return order(root);
    }

    public int order(TreeNode root){
        if(root == null)
            return 0;

        return Math.max(order(root.left), order(root.right)) + 1;
    }

}

