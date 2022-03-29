 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            root = queue.remove();
            if(root.val == sum && root.left == null && root.right == null) return true;
            if(root.left != null) {
                root.left.val += root.val;
                queue.add(root.left);
            }
            if(root.right != null) {
                root.right.val += root.val;
                queue.add(root.right);
            }
        }
        return false;
    }
}


