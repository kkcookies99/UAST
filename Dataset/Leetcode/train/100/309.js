 var XXX = function(p, q) {
  if (!p && !q) return true;
  if ((p && !q) || (!p && q)) return false
  let flag = true
  const helper = (p, q) => {
    if (!flag || (!p && !q)) return
    if ((!p && q) || (p && !q) || (p.val != q.val)) {
      flag = false
      return
    }
    helper(p.left, q.left)
    helper(p.right, q.right)
  }
  helper(p, q)
  return flag
};

