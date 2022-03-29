 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        Deque<TreeNode> leftStack = new LinkedList<>();
        Deque<TreeNode> rightStack = new LinkedList<>();
        leftStack.push(root.left);
        rightStack.push(root.right);

        while (!leftStack.isEmpty() && !rightStack.isEmpty()) {
            TreeNode leftNode = leftStack.pop(), rightNode = rightStack.pop();
            if (leftNode == null && rightNode == null) {
                continue;
            }
            if (leftNode == null || rightNode == null) {
                return false;
            }
            if (leftNode.val != rightNode.val) {
                return false;
            }
            leftStack.push(leftNode.right);
            leftStack.push(leftNode.left);
            rightStack.push(rightNode.left);
            rightStack.push(rightNode.right);
        }

        return true;
    }
}

