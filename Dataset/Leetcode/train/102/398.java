class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        XXX(root, result, 0);
        return result;
    }

    public void XXX(TreeNode root, List<List<Integer>> result, int level) {
        if (root == null) return;
        while (result.size() <= level) {
            List<Integer> item = new ArrayList();
            result.add(item);
        }
        result.get(level).add(root.val);
        XXX(root.left, result, level + 1);
        XXX(root.right, result, level + 1);
    }
}

