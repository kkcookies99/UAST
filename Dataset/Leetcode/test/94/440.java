 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traverse(root, res);
        return res;
    }

    private void traverse(TreeNode root, List<Integer> list) {
        if(root != null) {
            traverse(root.left, list);
            list.add(root.val);
            traverse(root.right, list);
        }
    }
}

