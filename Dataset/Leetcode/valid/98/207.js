 var XXX = function(root) {
  if (!root.left && !root.right) return true
  let arr = []
  const dfs = (root) => {
    if (!root) return
    dfs(root.left)
    arr.push(root.val)
    dfs(root.right)
  }
  dfs(root)
  for (let i = 1; i < arr.length; i++) {
    if (arr[i] <= arr[i - 1]) return false
  }
  return true
};

