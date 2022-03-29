 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.right == null && root.left == null) {
            return root.val == targetSum;
        }
        Queue<TreeNode2> queue = new LinkedList<>();
        TreeNode2 root2 = new TreeNode2(root);
        root2.val = targetSum-root.val;
        queue.add(root2);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode2 remove = queue.remove();
                if (remove.isYe) {
                    if (remove.val == 0) return true;
                } else {
                    if(remove.treeNode.left != null) {
                        TreeNode2 left = new TreeNode2(remove.treeNode.left);
                        left.val = remove.val - remove.treeNode.left.val;
                        queue.add(left);
                    }
                    if(remove.treeNode.right != null) {
                        TreeNode2 right = new TreeNode2(remove.treeNode.right);
                        right.val = remove.val - remove.treeNode.right.val;
                        queue.add(right);
                    }
                }

            }
        }
        return false;
    }
}
class TreeNode2 {

    public int val;
    public boolean isYe;
    public TreeNode treeNode;
    public TreeNode2(TreeNode treeNode) {
        this.treeNode = treeNode;
        if (treeNode.left==null && treeNode.right==null) {
            isYe = true;
        }
    }
}

