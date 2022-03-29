 public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        int l = TreeDepth(root.left);
        int r = TreeDepth(root.right);
        int sub = l - r;
        if(sub > 1 || sub < -1){
            return false;
        }
        return XXX(root.left) && XXX(root.right);
    }
    public int TreeDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        
        return (left > right) ? (left + 1) : (right + 1);
    }

