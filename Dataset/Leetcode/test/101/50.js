 var XXX = function(root) {
    if(!root) return false
    return dfs(root.left, root.right)
};

var dfs = function(left, right) {
    if(!left && !right) {
        return true
    }
    if(!left || !right) {
        return false
    }
    if(left.val === right.val) {
        return dfs(left.left, right.right) && dfs(left.right, right.left)
    } else {
        return false
    }
}

