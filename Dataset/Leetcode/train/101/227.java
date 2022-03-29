 class Solution {
    public boolean XXX(TreeNode root) {
        boolean f = fun(root.left, root.right);
        return f;
    }

    public boolean fun(TreeNode leftNode, TreeNode rightNode){
        if(leftNode == null && rightNode == null){
            return true;
        }
        if(leftNode == null || rightNode == null || leftNode.val != rightNode.val){
            return false;
        }
        return fun(leftNode.left, rightNode.right) && fun(rightNode.left, leftNode.right);    
    }
}

