 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.offer(root);
        queue2.offer(root);
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode temp1 = queue1.poll();
            TreeNode temp2 = queue2.poll();
            if (temp1.val != temp2.val) return false;
            if (temp1.left != null && temp2.right != null) {
                queue1.offer(temp1.left);
                queue2.offer(temp2.right);
            }
            else if (temp1.left == null && temp2.right == null) ;
            else return false;
            if (temp1.right != null && temp2.left != null) {
                queue1.offer(temp2.left);
                queue2.offer(temp1.right);
            }
            else if (temp1.right == null && temp2.left == null) ;
            else return false;
        }
        if (!queue1.isEmpty() || !queue2.isEmpty()) return false;
        return true;
    }
}

