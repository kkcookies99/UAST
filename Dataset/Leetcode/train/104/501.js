var XXX = function(root) {
  if (!root) return 0
  let max = 0
  function check(node, index) {
    const cur = index + 1
    if (cur > max) max = cur
    if (node.left !== null) {
      check(node.left, cur)
    }
    if (node.right !== null) {
      check(node.right, cur)
    }
  }
  if (root.left !== null) {
    check(root.left, 1)
  }
  if (root.right !== null) {
    check(root.right, 1)
  }
  return max || 1
};

