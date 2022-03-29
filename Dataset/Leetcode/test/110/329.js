var XXX = function(root) {
    if(!root) return true;
    let left = height(root.left);
    let right = height(root.right);
    return Math.abs(left-right) <= 1 && XXX(root.left) && XXX(root.right);
};

function height(root) {
    if(!root) return 0;
    return Math.max(height(root.left) , height(root.right)) + 1;
}

