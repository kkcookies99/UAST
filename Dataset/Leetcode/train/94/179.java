 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        XXX(root, list);
        return list;
    }

    private void XXX(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        XXX(root.left, list);
        list.add(root.val);
        XXX(root.right, list);
    }
}

