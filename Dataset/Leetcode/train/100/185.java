 public boolean XXX(TreeNode p, TreeNode q) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        dfs(p, a);
        dfs(q, b);
        if (a.size() == b.size()){
            for(int i = 0; i < a.size(); ++i){
                if (!a.get(i).equals(b.get(i))){
                    return false;
                }
            }
        }else {
            return false;
        }
        return true;
    }
    private void dfs(TreeNode p, List<Integer> res){
        if (p == null){
            res.add(-1);
            return;
        }
        res.add(p.val);
        dfs(p.left, res);
        dfs(p.right, res);
    }

