 var XXX = function(numRows) {
    if(numRows === 1) return [[1]]
    if(numRows === 2) return [[1],[1,1]]
    let res = [[1],[1,1]]
    for(let i = 2;i < numRows;i++){
        res.push(new Array(i + 1).fill(0))
        for(let j = 0;j < i + 1;j++){
            if(j === 0 || j === i) res[i][j] = 1
            else res[i][j] = res[i - 1][j - 1] + res[i - 1][j]
        }
    }
    return res
};

