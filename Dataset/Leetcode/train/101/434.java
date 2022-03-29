 class Solution {
    public boolean XXX(TreeNode root) {
        return symmetry(root, root);
    }
    private static boolean symmetry(TreeNode p, TreeNode q){
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(p);
        stack2.push(q);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            TreeNode node1 = stack1.pop();
            TreeNode node2 = stack2.pop();
            if (node1 == null && node2 == null){
                continue;
            }
            if ((node1 == null || node2 == null) || node1.val != node2.val){
                return false;
            }

            stack1.push(node1.left);
            stack2.push(node2.right);

            stack1.push(node1.right);
            stack2.push(node2.left);
        }
        return true;
    }
}

