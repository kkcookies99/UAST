var XXX = function(matrix) {
    const rotation = function(start, end) {
        for (let i = 0; i < end - start; i++) {
            const f1 = matrix[ start ][ start + i ];
            const f2 = matrix[ start + i ][ end ];
            const f3 = matrix[ end ][ end - i ];
            const f4 = matrix[ end - i ][ start ];
            matrix[ start ][ start + i ] = f4;
            matrix[ start + i ][ end ] = f1;
            matrix[ end ][ end - i ] = f2;
            matrix[ end - i ][ start ] = f3;
        }
        if (end - start > 0) {
            rotation(start+1, end-1);
        }
    }
    rotation(0, matrix.length-1);
};

