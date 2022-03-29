 public boolean XXX(TreeNode root) {
        return isB(root) >= 0 ;
    }

    private int isB(TreeNode node) {
        if(node == null){
            return 0;
        }

        int l = isB(node.left);
        int r = isB(node.right);

        return Math.abs(l - r) < 2 && l != -1 && r != -1 ? Math.max(l,r) + 1 : -1;
    
    }

