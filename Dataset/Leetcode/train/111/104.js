var XXX = function(root) {
  if (root == null) return 0
  if (root.left == null) return XXX(root.right) + 1
  if (root.right == null) return XXX(root.left) + 1
  return Math.min(XXX(root.left), XXX(root.right)) + 1
};

