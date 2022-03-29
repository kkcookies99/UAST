 var XXX = function(root) {
    if(root === null) return true;
    const dfs = (left, right) => {
        if (!left && !right) {
            return true;
        } else if (!left && right || left && !right) {
            return false;
        }
        
        return left.val === right.val && dfs(left.left, right.right) && dfs(left.right, right.left);
    } 
    
    return dfs(root.left, root.right)
};

