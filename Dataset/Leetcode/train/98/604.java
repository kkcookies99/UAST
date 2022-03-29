 class Solution {
    public boolean XXX(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        TreeNode preNode = null;
        while(!deque.isEmpty() || root!=null) {
            if (root!=null) {
                deque.push(root);
                root = root.left;
                continue;
            }
            TreeNode node = deque.pop();
            if (null == preNode || preNode.val < node.val) {
                preNode = node;
            } else {
                return false;
            }
            root = node.right;
        }
        return true;
    }
}

