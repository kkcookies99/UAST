var XXX = function(root) {
  if (!root) return 0
  if (root && !root.left && !root.right) return 1
  let left = XXX(root.left)
  let right = XXX(root.right)
  return Math.max(left, right) + 1
};

