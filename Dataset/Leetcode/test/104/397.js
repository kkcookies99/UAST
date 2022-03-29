var XXX = function(root) {
  if(root === null) {
    return 0;
  }

  const ld = XXX(root.left);
  const rd = XXX(root.right);

  return Math.max(ld, rd) + 1;

};
