var XXX = function(x) {
    if (x <= 1) {
        return x
    }
    for (var i = 1; i <= x; i++) {
        if(i * i > x) {
            return i - 1
        } 
    }
}

