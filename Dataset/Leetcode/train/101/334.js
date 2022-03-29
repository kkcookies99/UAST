 var XXX = function(root) {
  if (!root) return false
  if (root && !root.left && !root.right) return true
  let root1 = root.left, root2 = root.right
  if (!root1 || !root2) return false
  let temp1 = [root1], temp2 = [root2]
  while (temp1.length && temp2.length) {
    let t1 = temp1.shift()
    let t2 = temp2.shift()
    if (t1.val != t2.val) {
      return false
    }
    if (t1.left && t2.right) {
      temp1.push(t1.left)
      temp2.push(t2.right)
    } else {
      if ((t1.left && !t2.right) || (!t1.left && t2.right)) {
        return false
      }
    }
    if (t1.right && t2.left) {
      temp1.push(t1.right)
      temp2.push(t2.left)
    } else {
      if ((t1.right && !t2.left) || (!t1.right && t2.left)) {
        return false
      }
    }
  }
  return true
};

