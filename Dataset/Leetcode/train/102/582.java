class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
       List<List<Integer>> result = new ArrayList<>();
        if (null == root) {
            return result;
        }
        addToList(result, root, 0);
        return result;
    }

    private void addToList(List<List<Integer>> result, TreeNode node, int level) {
        if (node == null) {
            return;
        }
        //有什么其他好方法？
        try {
            result.get(level);
        } catch (Exception e) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(node.val);
        if (null != node.left) {
            addToList(result, node.left, level + 1);
        }
        if (null != node.right) {
            addToList(result, node.right, level + 1);
        }
    }
}

