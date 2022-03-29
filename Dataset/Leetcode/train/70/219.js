var XXX = function(n) {
    // js动态规划
    // let map = {
    //     0:1,
    //     1:1
    // }
    // let dfs = (n)=>{
    //     if(map[n])return map[n];
    //     map[n] = dfs(n-1)+dfs(n-2)
    //     return map[n];
    // }
    // return dfs(n)
    // 直接运算
    let map = {
        0:1,
        1:1
    }
    for(let i = 2;i<=n;i++){
        map[i] = map[i-1] + map[i-2]
    }
    return map[n]
};

