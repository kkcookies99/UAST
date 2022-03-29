 class Solution {
    public List<Integer> XXX(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        inOrder(res, root);
        return res;
    }
    private void inOrder(ArrayList<Integer> list, TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(list, node.left);
        list.add(node.val);
        inOrder(list, node.right);
    }
}

