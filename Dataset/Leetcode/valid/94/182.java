 class Solution {
    public List<Integer> XXX(TreeNode root) {
 List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        inOrderDfs(root, list);
        return list;
    }

    private void inOrderDfs(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inOrderDfs(node.left, list);
        list.add(node.val);
        inOrderDfs(node.right, list);
    }
}

