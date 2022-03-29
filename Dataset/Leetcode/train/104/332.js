var XXX = function(root) {
    let res=0;
    const dfs=(n,l)=>{
        if(!n){return;}
        res=Math.max(res,l);
        dfs(n.left,l+1);
        dfs(n.right,l+1);
    }
    dfs(root,1);
    return res
};

