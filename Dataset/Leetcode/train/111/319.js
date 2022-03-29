var XXX = function(root) {
  if (!root) return 0
  if (root && !root.left && !root.right) return 1
  let min = -1
  const dfs = (root, deep) => {
    if (root && !root.left && !root.right) {
      if (min == -1 || deep < min) min = deep
      return
    }
    if (min !== -1 && deep >= min) return
    if (root.left) {
      dfs(root.left, deep + 1)
    }
    if (root.right) {
      dfs(root.right, deep + 1)
    }
  }
  dfs(root, 1)
  return min
};

