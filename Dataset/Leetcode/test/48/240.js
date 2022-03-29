var XXX = function(matrix) {
    // 转置 
            for (let i = 0; i < matrix.length; i++) {
                for (let j = i + 1; j < matrix.length; j++) {
                    [matrix[i][j], matrix[j][i]] = [matrix[j][i], matrix[i][j]];
                }
            }
            // 每行逆置
            for (let i = 0; i < matrix.length; i++) {
                matrix[i].reverse();
            }
            return matrix;
};

