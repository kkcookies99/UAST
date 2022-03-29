var XXX = function(root) {
    let result = true;
    const dfs = (node) => {
        if(!node) return 0;
        const left = dfs(node.left) + 1;
        const right = dfs(node.right) + 1;
        
        if(Math.abs(left - right) > 1) {
            result = false;
        }
        
        return Math.max(left, right)
    }
    
    dfs(root)
    
    return result;
};

