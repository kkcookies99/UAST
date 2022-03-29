public int XXX(TreeNode root) {

    if(root == null) return 0;

    return Math.max(XXX(root.left)+1,XXX(root.right)+1);//分别递归左孩子深度和右孩子深度，每次递归深度层次+1

}

