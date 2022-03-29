var XXX = function(n) {
    let memo = [];
    memo[1] = 1;//一个台阶的时候,只有一种爬法
    memo[2] = 2;//两个台阶的时候,两种爬法
    for(let i =3; i<=n; i++) {
        // 例如：memo[3] = memo[1] + memo[2]
        memo[i] = memo[i-1] + memo[i-2];//记忆数组的规律
    }
    return memo[n];
};

