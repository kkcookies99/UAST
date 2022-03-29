public List<List<Integer>> XXX(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    dfs(1, root, res);
    return res;
}

public void dfs(int level, TreeNode root, List<List<Integer>> res){
    if(root == null){
        return;
    }
    if(res.size() < level){
        res.add(new ArrayList<>());
    }
    res.get(level - 1).add(root.val);
    dfs(level + 1, root.left, res);
    dfs(level + 1, root.right, res);
}

