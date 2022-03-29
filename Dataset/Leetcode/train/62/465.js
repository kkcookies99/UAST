var XXX = function(m, n) {
    let f = new Array(n+1).fill(0)
    f[n] = 0, f[n-1] = 1
    for(i = m-1; i >=0 ; i--) {
        for(j = n-1; j >=0; j--) {
            f[j] = f[j] + f[j+1]
        }
    }
    return f[0]
};

