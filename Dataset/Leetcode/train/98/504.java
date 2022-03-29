 class Solution {
        ArrayDeque<Integer> midOrder = new ArrayDeque<>();

        public boolean XXX(TreeNode root) {
            return traverse(root);
        }

        boolean traverse(TreeNode root) {
            if (root == null) return true;
            if (traverse(root.left) && (midOrder.isEmpty() || root.val > midOrder.peekLast())) {
                midOrder.add(root.val);
            } else return false;
            return traverse(root.right);
        }
    }

