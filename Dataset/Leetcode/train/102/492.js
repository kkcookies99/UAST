var XXX = function(root) {
    if(root == null) return [];
    let res = [];
    function dfs(r,t){
        while(res.length < t) res.push([]);
        res[t-1].push(r.val);
        if(r.left) dfs(r.left,t+1);
        if(r.right) dfs(r.right,t+1);
    }
    dfs(root,1);
    return res;
};

