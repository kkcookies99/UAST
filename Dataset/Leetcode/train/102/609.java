public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        help(root,0,res);
        return res;
    }
    public void help(TreeNode root,int level,List<List<Integer>>res){
        if (root==null)return;
        if (res.size()==level){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.val);
            res.add(list);
        }else res.get(level).add(root.val);
        help(root.left, level+1, res);
        help(root.right, level+1, res);
    }

