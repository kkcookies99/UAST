 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null){
            return true;
        }
        return preambleParseTree(root.left,root.right);
    }

    public boolean preambleParseTree(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        } else if (leftNode != null && rightNode != null) {
            if (leftNode.val != rightNode.val) {
                return false;
            }
            boolean leftResult = preambleParseTree(leftNode.left, rightNode.right);
            boolean rightResult = preambleParseTree(rightNode.left, leftNode.right);
            if ( !leftResult || !rightResult){
                return false;
            }
            return true;
        }else{
            return false;
        }
    }
}

