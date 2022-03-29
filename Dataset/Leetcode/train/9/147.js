var XXX = function(x) {
    if (x < 0) return false
    let a = 0, b = x;
    while(x > 0) {
        a = a * 10 + x % 10
        x = x / 10 | 0
    }
    return a === b
}

