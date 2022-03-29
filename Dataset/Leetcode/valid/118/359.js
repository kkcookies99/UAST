 var XXX = function(numRows) {
    var m = []
    for (var i = 1; i<=numRows;i++) {
        var n = []
        for(var j =1; j<=i; j++) {
            if (j===1||j===i) {
                n.push(1)
            } else {
                // console.log(m[i-2][j-1])
                var s = m[i-2][j-1] + m[i-2][j-2]
                n.push(s)
            }
            // console.log(n)
        }
        m.push(n)
    }
    console.log(m)
    return m
};

