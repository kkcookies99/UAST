var XXX = function(m, n) {
    let f = new Array(m+1).fill(0).map(() => new Array(n+1).fill(0))
    f[m][n-1] = 1
    for(i = m-1; i >=0 ; i--) {
        for(j = n-1; j >=0; j--) {
            f[i][j] = f[i+1][j] + f[i][j+1]
        }
    }
    return f[0][0]
};

