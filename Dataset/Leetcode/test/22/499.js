 var XXX = function(n) {
    if(n <= 0) return [];
    let res = [];
    dfs(n, n, "");
    function dfs(left, right, str){
        if(left === 0 && right === 0){
            res.push(str);
            return;
        }else{
            if(left > 0) dfs(left - 1, right, str + '(');
            if(right > left) dfs(left, right - 1, str + ')');
        }
    }
    return res;
};

