public int XXX(TreeNode root) {
    if(root==null){
        return 0;
    }
    int l=XXX(root.left);
    int r=XXX(root.right);
    if(root.left==null||root.right==null){
        return (l>r?l:r)+1;
    }
    return (l>r?r:l)+1;
}

