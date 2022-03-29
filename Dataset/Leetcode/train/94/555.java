 class Solution {
    public List<Integer> XXX(TreeNode root) {
        ArrayList<Integer> rst = new ArrayList<>();
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.addFirst(root);
                root = root.left;
            }
            root = stack.removeFirst();
            rst.add(root.val);
            root = root.right;
        }
        return rst;
    }
}

