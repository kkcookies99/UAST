 var XXX = function(root) {
  if (root === null) {
    return true
  }
  return Math.abs(height(root.left) - height(root.right)) <= 1 && XXX(root.left) && XXX(root.right)
};


// 求高度
function height(root) {
  if (root === null) {
    return 0
  }
  return 1 + Math.max(height(root.left), height(root.right))
}


