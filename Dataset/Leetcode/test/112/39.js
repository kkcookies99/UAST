var XXX = function(root, targetSum) {
    if(!root) return false;
    if(root.left ===null && root.right === null) return root.val === targetSum;
    targetSum -= root.val;
    return XXX(root.left, targetSum) || XXX(root.right, targetSum);
};

