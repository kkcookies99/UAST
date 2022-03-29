 public boolean XXX(TreeNode root) {
    if(root == null) return true;
    return XXX(root.left) && XXX(root.right) && max_value(root.left) < root.val && root.val < min_value(root.right);
}
public long max_value(TreeNode root){
    if(root == null) return Long.MIN_VALUE;
    return Math.max(Math.max(max_value(root.left), max_value(root.right)),root.val);
}

public long min_value(TreeNode root){
    if(root == null) return Long.MAX_VALUE;
    return Math.min(Math.min(min_value(root.left), min_value(root.right)),root.val);
}
