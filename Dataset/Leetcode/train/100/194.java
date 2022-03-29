  public boolean XXX(TreeNode p, TreeNode q) {
        return travers(p).equals(travers(q));
    }

    public String travers(TreeNode root){
        if(root == null){
            return ",";
        }
        return String.valueOf(root.val) + travers(root.left) +travers(root.right);
    }

