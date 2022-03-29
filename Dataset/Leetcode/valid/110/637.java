    public boolean XXX(TreeNode root) {
        if (root == null)return true;
        int dis = treeHeight(root.left) - treeHeight(root.right);// 左子树和右子树差 绝对值小余1
        if (dis >= -1 && dis <= 1 )return XXX(root.left) && XXX(root.right);//子树的 左右子树高度差绝对值小余等于1
        return false;
    }
    public int treeHeight(TreeNode node){
        if (node == null)return 0;
        return Math.max(treeHeight(node.left),treeHeight(node.right))+1;
    }

