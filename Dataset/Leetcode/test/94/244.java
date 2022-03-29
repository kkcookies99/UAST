  public List<Integer> XXX(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        handle(root,result);
        return result;
    }

    void handle(TreeNode root, List<Integer> list){
        if (root!=null) {
            handle(root.left,list);
            list.add(root.val);
            handle(root.right,list);
        }
    }

