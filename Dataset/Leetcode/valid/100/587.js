 var XXX = function(p, q) {
  if (!p && !q) {
    return true;
  }

  if (!p || !q || p.val !== q.val) {
    return false;
  }

  return XXX(p.left, q.left) && XXX(p.right, q.right);
};

