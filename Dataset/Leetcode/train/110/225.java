    public boolean XXX(TreeNode root) {
        if(root==null){
            return true;
        }
        
        //判断根节点是否平衡
        boolean flag = Math.abs(getHeap(root.left)-getHeap(root.right))<=1;

        //根节点平衡，左子树平衡，右子树都平衡时返回true
        return  flag && XXX(root.left) && XXX(root.right);
    }

    //求每个节点的最大高度
    public int getHeap(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(getHeap( root.left),getHeap( root.right))+1;
    }

