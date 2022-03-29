var XXX = function(root) {
  if (!root) return []
  const res = []
  dfs(1, root, res)

  function dfs(index, root, res) {
    if (res.length < index) {
      res.push([])
    }

    res[index - 1].push(root.val)
    if (root.left) dfs(index + 1, root.left, res)
    if (root.right) dfs(index + 1, root.right, res)
  }

  return res
};

