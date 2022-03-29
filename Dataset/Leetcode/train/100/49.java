 public boolean XXX(TreeNode p, TreeNode q) {
  return (p == q) || (p != null && q != null && p.val == q.val && XXX(p.left, q.left) && XXX(p.right, q.right));
}

