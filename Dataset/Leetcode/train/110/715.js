 var XXX = function(root) {
  if (!root) return true
  return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 && XXX(root.left) && XXX(root.right)
  function maxDepth(node) {
    if (!node) return 0
    return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1
  }
}

