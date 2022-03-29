    public int XXX(TreeNode root) {
        if(root == null) return 0;
        else if(root.left==null) return XXX(root.right)+1; //左边没有，只考虑右侧分支
        else if(root.right==null) return XXX(root.left)+1; //右分支没有，只考虑左侧分支情况
        return Math.min(XXX(root.left),XXX(root.right))+1;//左右分支均有，则取最小值
    }

