 var XXX = function(root) {
    var res = [];
    dfs(root, 0);
    return res;
    function dfs(root, n){
        if(!root) return;
        if(!Array.isArray(res[n])){
            res[n] = [];
        }
        res[n].push(root.val);
        dfs(root.left, n+1);
        dfs(root.right, n+1);
    }
};

