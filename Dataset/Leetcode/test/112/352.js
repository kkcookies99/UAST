 var XXX = function(root, targetSum) {
  if (!root) return false;
  let bol = false, temp = root.val;
  const T = (root) => {
    if ((!root.left && !root.right) || bol) {
      if (temp == targetSum) {
        bol = true
      }
      return 0
    }
    if (root.left) {
      temp += root.left.val;
      T(root.left)
      temp -= root.left.val;
    }
    if (root.right) {
      temp += root.right.val;
      T(root.right)
      temp -= root.right.val;
    }
  }
  T(root)
  return bol;
};

