    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        bfs(root, 1, res);
        return res;
    }

    public void bfs(TreeNode root, int depth, List<List<Integer>> res){
        if(root == null){
            return;
        }
        if(depth > res.size()){
            res.add(new ArrayList<>());
        }
        res.get(depth-1).add(root.val);
        bfs(root.left, depth+1, res);
        bfs(root.right, depth+1, res);
    }

