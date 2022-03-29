var XXX = function(root) {
  if(root === null) return 0;
    var left = XXX(root.left);
    var right = XXX(root.right);
    return Math.max(left,right)+1;
};

