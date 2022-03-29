     public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        //左
        if(root.left!= null){
            list.addAll(XXX(root.left));
        }
        //根
        list.add(root.val);
        //右
        if(root.right != null){
            list.addAll(XXX(root.right));
        }
        return list;
    }

