    var XXX = function(n) {
        if (n === 1 || n === 2) {
            return n
        }

        if (XXX[n]) {
            return XXX[n]
        }

        XXX[n] = XXX(n - 1) + XXX(n - 2)
        return  XXX[n]
    };

