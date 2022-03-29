 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            traversal(list, root);
        }
        return list;
    }

    private void traversal(List<Integer> list, TreeNode root) {
        if (root.left != null) {
            traversal(list, root.left);
        }

        list.add(root.val);

        if (root.right != null) {
            traversal(list, root.right);
        }
    }
}

