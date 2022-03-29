 var XXX = function(m, n) {
    let dp = new Array(m).fill([])
    for(let i=0;i<m;i++){
        for(let j=0;j<n;j++){
             //  只有是i，j有一个是0，那dp[i][j]都是1
            if(i===0 || j===0){
                dp[i][j] = 1
            }else{
                dp[i][j] = dp[i-1][j] + dp[i][j-1]
            }
        }
    }
    return dp[m-1][n-1]
}

