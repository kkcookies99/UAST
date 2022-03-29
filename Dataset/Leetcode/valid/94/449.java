 public List<Integer> XXX(TreeNode root) {
        if (root==null){
            return list;
        }
        if(root.left != null) {
            XXX(root.left);
        }
        list.add(root.val);
        if (root.right != null) {
            XXX(root.right);
        }
        return list;
    }
     List list = new ArrayList();

