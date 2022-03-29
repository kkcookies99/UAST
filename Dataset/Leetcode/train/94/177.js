 var XXX = function(root) {
    let result = []
    function dfs(root){
        if(root === null) return []
        dfs(root.left)
        result.push(root.val)
        dfs(root.right)
    }
    dfs(root)
    return result
};
