class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        helper(root, lists, 0);
        return lists;
    }

    private void helper(TreeNode node, List<List<Integer>> lists, int depth) {
        if (node == null) return;
        if (lists.size() <= depth){
            lists.add(new ArrayList<>());
        }
        lists.get(depth).add(node.val);
        helper(node.left, lists, depth +1);
        helper(node.right, lists, depth +1);
    }
}

