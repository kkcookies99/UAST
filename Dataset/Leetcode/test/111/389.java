public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            int l = XXX(root.left);
            int r = XXX(root.right);
            if(l != 0 && r != 0){
                return Math.min(l, r) + 1;
            }else{
                //为null的节点不参与比较
                return Math.max(l, r) + 1;
            }
            
        }
    }

