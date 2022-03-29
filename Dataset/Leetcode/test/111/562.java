    public int XXX(TreeNode root) {
        // 返回根结点左右子树的最小深度 后序遍历
        if(root == null) return 0;
        // 当前结点是否是叶子结点，更新最小深度
        if(root.left == null && root.right == null){
            return 1;
        }     
        // 根据结点类型返回本结点的最小深度     
        if(root.left != null && root.right == null){ // 有左无右，左子树最小深度 + 1
            return XXX(root.left) + 1;
        }else if(root.left == null && root.right != null){ // 有右无左，右子树最小深度 + 1
            return XXX(root.right) + 1;
        }else{ // 有左有右，左右子树的最小值 + 1
            return Math.min(XXX(root.left),XXX(root.right)) + 1; 
        }
    }

