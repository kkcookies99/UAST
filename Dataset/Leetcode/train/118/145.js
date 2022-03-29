 var XXX = function(numRows) {
    let res = Array.from({length: numRows}, (v, i) => Array(i+1));

    for(let i=0, j=0; i<numRows; i++) {
        for(let j=0; j<=i; j++) {
            if(j == 0 || j==res[i].length-1) {
                res[i][j]  = 1;
            } else {
                res[i][j] = res[i-1][j-1] + res[i-1][j];
            }
        }
    }
    return res;
};

