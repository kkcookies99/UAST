class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        dfs(root, 1, result);
        return result;
    }

    public void dfs(TreeNode node, int level, List<List<Integer>> result) {
        if(node == null) {
            return;
        }
        if(result.size() < level){
            result.add(new ArrayList<>());
            result.get(level - 1).add(node.val);
        }else {
            result.get(level - 1).add(node.val);
        }
        dfs(node.left, level +1, result);
        dfs(node.right, level +1, result);
    }
}

