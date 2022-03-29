public int XXX(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        int level = 1;
        if(root != null){
            qu.offer(root);
        }
        while(!qu.isEmpty()){
            int size = qu.size();
            while(size > 0){
                root = qu.poll();
                size --;
                if(root.left == null && root.right == null){
                    return level;
                }else{
                    if(root.left != null){
                        qu.offer(root.left);
                    }
                    if(root.right != null){
                        qu.offer(root.right);
                    }
                }
            }
            level ++;
        }
        return 0;
    }

