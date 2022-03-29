    public int XXX(TreeNode root) {
        
        if(root == null){
            return 0;
        }

        // leaf
        if(root.left == null && root.right == null){
            return 1;
        }
        // not leaf
        // right is not null
        else if(root.left == null){
            return XXX(root.right) + 1;
        }
        // left is not null
        else if(root.right == null){
            return XXX(root.left) + 1;
        }
        
        // children are not null
        return Math.min(XXX(root.left), XXX(root.right)) + 1;
        
    }

