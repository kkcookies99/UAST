var XXX = function(root) {
  if (!root || (root && !root.left && !root.right)) return true
  let flag = true
  const helper = (root) => {
    if (!root || !flag) return 0
    let left = helper(root.left)
    let right = helper(root.right)
    if (Math.abs(left - right) > 1) flag = false
    return Math.max(left, right) + 1
  }
  helper(root)
  return flag
};

