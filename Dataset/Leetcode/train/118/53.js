 var XXX = function(numRows) {
    let res = [[1]];
    for(let i = 2; i <= numRows; i++) {
        let temp = [1];
        for(let j = 1; j < i - 1; j++) {
            temp[j] = res[i-2][j-1]+res[i-2][j];
        }
        temp[i-1] = 1;
        res.push(temp);
    }
    return res;
};

