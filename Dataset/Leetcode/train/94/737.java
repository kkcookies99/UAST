  public List<Integer> XXX(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode t = root;
        while(t != null || !stack.isEmpty()){
            if(t != null){
                stack.push(t);
                t = t.left;
            } else {
                t = stack.pop();
                list.add(t.val);
                t = t.right;
            }
        }
        return list;
    }

