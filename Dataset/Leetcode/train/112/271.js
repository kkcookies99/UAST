 var XXX = function(root, targetSum) {
    return bf(root, targetSum)
};

const bf = function(root, targetSum) {
    if(root == null) return false
    if(root.val == targetSum && root.left == undefined && root.right == undefined) return true
    let bool = bf(root.left, targetSum - root.val)
    if(bool) return true
    let aool = bf(root.right, targetSum - root.val)
    return aool
}

