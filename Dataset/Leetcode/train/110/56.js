var XXX = function(root) {
    if(!root) return true;
    if(Math.abs(depth(root.left) - depth(root.right)) > 1) return false;
    return XXX(root.left) && XXX(root.right);
};

var depth = function(root) {
    if(!root) return 0;
    return Math.max(depth(root.left), depth(root.right)) + 1;
}

