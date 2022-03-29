 class Solution {
    List<Integer> nodes = new ArrayList<>();
    public boolean XXX(TreeNode root) {
        inorderTraverse(root);
        for (int i = 1; i < nodes.size(); i ++) {
            if (nodes.get(i) <= nodes.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
    //得到树的中序遍历
    public void inorderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraverse(root.left);
        nodes.add(root.val);
        inorderTraverse(root.right);
    }
}

