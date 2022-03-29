var XXX = function(root) {
  if (!root) return 0;
  let l = XXX(root.left);
  let r = XXX(root.right);
  if (l == 0) return r + 1;
  if (r == 0) return l + 1;
  return Math.min(l, r) + 1;
};

