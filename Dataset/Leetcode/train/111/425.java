public int XXX(TreeNode root) {
   if (root == null) {
        return 0;
    }
    helper(root);
    return ret;
}

public void helper(TreeNode root){
    count++;
    if(root.left == null && root.right == null){
        ret = Math.min(ret,count);
        return;
    }
    if(root.left != null){
        helper(root.left);
        count--;
    }
    if(root.right != null){
        helper(root.right);
        count--;
    }
}
