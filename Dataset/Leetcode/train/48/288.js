var XXX = function(matrix) {
    let newArr = JSON.parse(JSON.stringify(matrix))
    newArr.reverse()
    for (let i = 0; i < newArr.length; i++) {
        for (let j = 0; j < newArr[i].length; j++) {
            matrix[i][j] = newArr[j][i]
        }
    }
};

