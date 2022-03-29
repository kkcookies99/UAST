var XXX = function(m, n) {
    const grid = Array.from({length:m},()=>Array.from({length:n}).fill(1))
    for(let i=1; i<m; i++){
        for(let j=1; j<n; j++){
            grid[i][j] = grid[i-1][j]+grid[i][j-1]
        }
    }
    return grid[m-1][n-1];
};

